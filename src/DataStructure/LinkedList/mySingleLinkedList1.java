package DataStructure.LinkedList;

public class mySingleLinkedList1<T> {

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> head = null;

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        mySingleLinkedList1<Integer> singleLinkedList = new mySingleLinkedList1<>();
        singleLinkedList.addNode(788);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);
        singleLinkedList.addNode(4);

        System.out.println(singleLinkedList.head.data);
        System.out.println(singleLinkedList.head.next.data);
        singleLinkedList.printAll();
    }

}
