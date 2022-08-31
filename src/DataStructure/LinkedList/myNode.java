package DataStructure.LinkedList;

public class myNode<T> {
    T data;
    myNode<T> head = null;
    myNode<T> next = null;

    public myNode(T data) {
        this.data = data;
    }

    public String toString() {
        return data.toString();
    }

    public static void main(String[] args) {
        myNode<Integer> node1 = new myNode<>(1);
        myNode<Integer> head = node1;

        myNode<Integer> node2 = new myNode<>(2);

        node1.next = node2;

        System.out.println(node1.next.toString());
    }
}
