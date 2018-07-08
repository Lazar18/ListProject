package myCollection;


import listExample.MyElement;

public class MyCollectionImpl implements MyCollection {

    private MyNode firstElement;
    private MyNode lastElement;
    private int size = 0;


    @Override
    public void enqueue(MyNode myNode) {
        if (listIsEmpty()) {
            this.firstElement = myNode;
            this.lastElement = myNode;
        } else {
            myNode.setNextElement(this.lastElement);
            this.lastElement = myNode;
        }
        size++;
    }

    private boolean listIsEmpty() {
        return this.firstElement == null;
    }

    @Override
    public MyNode dequeue() {
        MyNode temporary = this.lastElement;                                              //
        while (!temporary.getNextElement().equals(this.firstElement)) {                   // MOJA
            temporary = temporary.getNextElement();                                       // PRÓBA
        }                                                                                 // ROZWIĄZANIA
        MyNode first = firstElement;                                                      //
        temporary.setNextElement(null);// ("odcinamy" odwołanie do usuwanego elementu poniedziałek)//
        firstElement = temporary; // (ustawiamy jako pierwszy element nasz element z WHILE, czyli wtorek) //
        size--;                                                                           //
        return first;                                                                     //

    }

//        MyNode temporary = this.lastElement;
//        while (temporary.getNextElement() != firstElement) {
//            temporary = temporary.getNextElement();
//        }
//        MyNode tempResult = firstElement;
//        temporary.setNextElement(null);
//        firstElement = temporary;
//        size--;
//        return tempResult;
//    }

    @Override
    public String returnCollectionAsString() {
        String wynik = "";
        MyNode temporary = this.lastElement;
        while (temporary != null) {

            wynik += temporary.getMyString() + ", ";
            temporary = temporary.getNextElement();
        }
        return wynik;
    }

    @Override
    public int getSize() {
        return size;
    }
}
