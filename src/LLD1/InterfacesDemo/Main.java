package LLD1.InterfacesDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStack<List<Integer>> st = new ArrayStack<>();
        st.push(List.of(10, 20) );
        st.push(List.of(10, 23) );
        st.push(List.of(144, 20) );

        System.out.println(st.peek());

        st.showStack();
    }
}
