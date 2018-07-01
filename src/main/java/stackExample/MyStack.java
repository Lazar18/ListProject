package stackExample;

public interface MyStack {
    public void push(MyStackElem myStackElem);
    public MyStackElem pop();
    public int size();

    public String getAllElementOfStack();
    public boolean isEmpty();
}
