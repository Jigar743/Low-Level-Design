package LLD1.InterfacesDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<T> implements MyStack<T> {

    private List<T> items;

    public ArrayStack(){
        items = new ArrayList<>();
    }

    @Override
    public void push(T ele) {
        items.add(ele);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    @Override
    public void showStack() {
        System.out.print("Stack has this elements: ");
        while (this.size() != 1){
            System.out.print(this.pop() + " ,");
        }

        System.out.print(this.pop());
    }
}
