package listExample;

public class MyElement {
    private String myString;
    private MyElement nextElement;

    public MyElement(String myElementString){
        this.myString = myElementString;
        this.nextElement = null;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public MyElement getNextElement() {
        return nextElement;
    }

    public void setNextElement(MyElement nextElement) {
        this.nextElement = nextElement;
    }
}
