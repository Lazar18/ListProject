package listExample;

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

    @Override
    public void remove(String element) {
        // 1 wariant - usuwanie pierwszego elementu //
        // firstElement przestawić na "drugi" obiekt listy
        // w usuwanym elemencie ustawić next na

        // 2 wariant - usuwanie środkowego elementu //
        // 3 wariant - usuwanie ostatniego elementu //
        MyElement temporary;
        if (this.firstElement.getMyString().equals(element)) {
            temporary = this.firstElement;
            this.firstElement = this.firstElement.getNextElement();
            temporary.setNextElement(null);
        } else {
            MyElement temporaryPrev = firstElement;
            MyElement temporaryCurrent = firstElement.getNextElement();
            MyElement temporaryNext = temporaryCurrent.getNextElement();

            while (!temporaryCurrent.getMyString().equals(element)) {
                temporaryPrev = temporaryCurrent;
                temporaryCurrent = temporaryCurrent.getNextElement();
                temporaryNext = temporaryCurrent.getNextElement();
            }
            temporaryPrev.setNextElement(temporaryNext);

            if (temporaryCurrent.getMyString().equals(lastElement.getMyString())){
                this.lastElement = temporaryPrev;
            }
        }
        size--;
    }

    @Override
    public String showFirstAndLast() {
        return firstElement.getMyString() + ", " + lastElement.getMyString();
    }

    private boolean listIsEmpty() {
        return this.firstElement == null;
    }


}
