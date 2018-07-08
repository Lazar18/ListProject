package myCollection;

public class MyNode {

    private String myString;
    private MyNode nextElement;

    public MyNode(String myElementString) {
        this.myString = myElementString;
        this.nextElement = null;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public MyNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(MyNode nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
        return myString;
    }
}
