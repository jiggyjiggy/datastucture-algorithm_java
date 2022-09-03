package DataStructure.LinkedList;

public class myDoubleLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    private class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    private T searchFromHead(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    private T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        myDoubleLinkedList<Integer> myDoubleLinkedList = new myDoubleLinkedList<>();

        myDoubleLinkedList.addNode(1);
        myDoubleLinkedList.addNode(4);
        myDoubleLinkedList.addNode(3);
        myDoubleLinkedList.addNode(5);
        myDoubleLinkedList.addNode(8);
        myDoubleLinkedList.printAll();

        myDoubleLinkedList.searchFromHead(5);

        myDoubleLinkedList.searchFromTail(5);
    }
}
