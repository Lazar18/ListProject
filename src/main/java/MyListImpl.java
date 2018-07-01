public class MyListImpl implements MyList {

    private MyElement firstElement;
    private MyElement lastElement;
    private int size;

    public MyListImpl() {
        this.firstElement = null;
    }

    @Override
    public void add(String myElementString) {
        MyElement myElementToAdd = new MyElement(myElementString);

        if (listIsEmpty()) {
            this.firstElement = myElementToAdd;
            this.lastElement = myElementToAdd;
        } else {
            MyElement temporaryElement = this.lastElement;
            temporaryElement.setNextElement(myElementToAdd);
            this.lastElement = myElementToAdd;
        }
        size++;
    }

    public String returnListAsString() {
        String wynik = "";
        MyElement temporary = this.firstElement;
        while (temporary != null) {

            wynik += temporary.getMyString() + ", ";
            temporary = temporary.getNextElement();
        }
        return wynik;
    }

    @Override
    public int getListSize() {
        return size;
    }


    private boolean listIsEmpty() {
        return this.firstElement == null;
    }


}
