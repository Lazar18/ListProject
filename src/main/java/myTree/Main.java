package myTree;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Main {
    public static void main(String... args) {

        log.info("START");
        MyTree myTree = new MyTreeImpl();
//        for (int a = 1; a<=8; a++){
//            myTree.insert(a);
//        }
        myTree.insert(8);
        myTree.insert(3);
        myTree.insert(10);
        myTree.insert(1);
        myTree.insert(6);
        myTree.insert(14);
        myTree.insert(4);
        myTree.insert(7);
        myTree.insert(13);
        myTree.insert(5);

        myTree.search(5);
        myTree.min();
        myTree.max();

        //myTree.remove(3);
        myTree.showInOrder(((MyTreeImpl) myTree).root);
//        myTree.showInPreOrder();
//        myTree.showInPostOrder();

    }
}
