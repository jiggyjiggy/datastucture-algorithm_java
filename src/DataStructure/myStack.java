package DataStructure;

import java.util.ArrayList;

public class myStack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString() {
        return stack.toString();
    }

    public static void main(String[] args) {
        myStack<Integer> stack = new myStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.toString());
    }
}
