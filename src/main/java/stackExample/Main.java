package stackExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(listExample.Main.class);

    public static void main(String[] args) {

        MyStackElem <String> jan = new MyStackElem("January");
        MyStackElem <String> feb = new MyStackElem("February");
        MyStackElem <String> mar = new MyStackElem("March");
        MyStackElem <String> apr = new MyStackElem("April");
        MyStackElem <String> may = new MyStackElem("May");

        MyStack myStack = new MyStackImpl();
        myStack.push(jan);
        myStack.push(feb);
        myStack.push(mar);

        myStack.pop();
        logger.info("{}", myStack.pop().getContent());
//        logger.info("{}", myStack.pop().getContent());
//        logger.info("{}", myStack.pop().getContent());
//
        myStack.push(apr);
        myStack.push(may);
//
//        logger.info("{}", myStack.pop().getContent());

        logger.info(myStack.getAllElementOfStack());
        logger.info("{}", myStack.size());

        logger.info("END");
    }

}
