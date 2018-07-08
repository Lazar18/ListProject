package myCollection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import listExample.MyList;
import listExample.MyListImpl;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Logger is working");

        MyCollection myCollection = new MyCollectionImpl();
        myCollection.enqueue(new MyNode("poniedzialek"));
        myCollection.enqueue(new MyNode("wtorek"));
        myCollection.enqueue(new MyNode("sroda"));
        myCollection.enqueue(new MyNode("czwartek"));
        myCollection.enqueue(new MyNode("piatek"));

        logger.info(myCollection.returnCollectionAsString());
        logger.info("size of collection {}",  myCollection.getSize());

        logger.info("dequeue element of collection {}", myCollection.dequeue());
//
        logger.info(myCollection.returnCollectionAsString());
        logger.info("size of collection {}",  myCollection.getSize());
    }


}
