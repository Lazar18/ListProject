package myCollection;

public interface MyCollection {

    void enqueue(MyNode myElement);
    MyNode dequeue();

    String returnCollectionAsString();
    int getSize();
}


