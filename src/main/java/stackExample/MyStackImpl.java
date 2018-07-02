package stackExample;

public class MyStackImpl implements MyStack {

    private int size = 0;
    MyStackElem first;

    @Override
    public void push(MyStackElem stackElem) {
        size++;
        stackElem.setNext(first);
        this.first = stackElem;
    }

    @Override
    public MyStackElem pop() {
        size--;
        if (!isEmpty()) {
            MyStackElem temporary = this.first;
            this.first = this.first.getNext();
            return temporary;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String getAllElementOfStack() {
        MyStackElem temp = first;
        String result = "";
        while (temp != null){
            result += temp.getContent() + ", ";
            temp = temp.getNext();
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }


}
