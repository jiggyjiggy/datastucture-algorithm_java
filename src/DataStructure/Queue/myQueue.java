package DataStructure;

import java.util.ArrayList;

public class myQueue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String toString() {
        return queue.toString();
    }

    public static void main(String[] args) {
        myQueue<Integer> myQueue = new myQueue<Integer>();
        myQueue.enqueue(1);
        myQueue.enqueue(3);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        System.out.println(myQueue.toString());
    }

}
