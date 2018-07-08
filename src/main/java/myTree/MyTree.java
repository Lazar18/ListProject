package myTree;

public interface MyTree {
    public void insert(int i);
    public Node search(int i);
    public Node min();
    public Node max();
    public Node remove(int i) throws Exception;
    public void showInOrder(Node node);
    public void showInPreOrder(Node node);
    public void showInPostOrder(Node node);
}
