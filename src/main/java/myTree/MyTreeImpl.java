package myTree;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter

public class MyTreeImpl implements MyTree {

    public Node root = null;


    @Override
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            Node actual = root;
            Node parent = null;
            while (actual != null) {
                parent = actual;
                if (actual.getKey() > key)
                    actual = actual.getLeft();
                else {
                    actual = actual.getRight();
                }
            }
            if (parent.getKey() > key) {
                parent.setLeft(new Node(key));
                parent.getLeft().setParent(parent);
            } else {
                parent.setRight(new Node(key));
                parent.getRight().setParent(parent);
            }
        }
    }

    @Override
    public Node search(int key) {
        Node searchNode = root;
        while (searchNode != null && searchNode.getKey() != key) {
            searchNode = searchNode.getKey() > key ? searchNode.getLeft() : searchNode.getRight();
        }
        log.info("SEARCHED: " + searchNode);
        return searchNode;
    }

    @Override
    public Node min() {
        Node minNode = root;
        while (minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }
        log.info("MIN: " + minNode.getKey());
        return minNode;
    }

    @Override
    public Node max() {
        Node maxNode = root;
        while (maxNode.getRight() != null) {
            maxNode = maxNode.getRight();
        }
        log.info("MAX: " + maxNode.getKey());

        return maxNode;

    }

    @Override
    public Node remove(int key) throws Exception {
        Node nodeToRemove = this.search(key);
        Node parentOfNodeToRemove = nodeToRemove.getParent();
        Node temp;
        if (nodeToRemove.getLeft() != null &&
                nodeToRemove.getRight() != null) {
            temp = this.remove(this.sucessor(key).key);
            if(temp.getLeft() != null)
                temp.getLeft().setParent(temp);
            temp.setParent(nodeToRemove.right);
            if(temp.getRight() != null)
                temp.getRight().setParent(temp);
        } else
            temp = nodeToRemove.getLeft() != null ?
                    nodeToRemove.getLeft() : nodeToRemove.getRight();
        if (temp != null) {
            temp.setParent(parentOfNodeToRemove);
        }
        if (parentOfNodeToRemove == null) {
            root = temp;
        } else if (parentOfNodeToRemove.getLeft() == nodeToRemove) {
            parentOfNodeToRemove.setLeft(temp);
        } else {
            parentOfNodeToRemove.setRight(temp);
        }
        return nodeToRemove;
    }

    private Node sucessor(int key) throws Exception {
        Node node = this.search(key);

        if(node.getLeft() != null) {
            node = node.getLeft();
            while(node.right != null) {
                node = node.right;
            }
            return node;
        } else if(node.getLeft() == null && node !=
                this.root && node != this.min()) {
            Node parent = node.getParent();
            while (parent != root && parent.getKey() > node.getKey()) {
                parent = parent.getParent();
            }
            return parent;
        }
        else throw new Exception("NIE MA");
    }

    @Override
    public void showInOrder(Node node) {
        //log.info("INORDER");
        if (node != null){
            showInOrder(node.getLeft());
            log.info("Value: {}", node.key);
            showInOrder(node.getRight());
        }

    }

    @Override
    public void showInPreOrder(Node node) {

    }

    @Override
    public void showInPostOrder(Node node) {

    }
}
