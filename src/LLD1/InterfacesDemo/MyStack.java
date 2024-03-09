package LLD1.InterfacesDemo;

public interface MyStack<T> {
    void push(T ele);
    T pop();
    int size();
    boolean isEmpty();
    T peek();
    void showStack();
}
