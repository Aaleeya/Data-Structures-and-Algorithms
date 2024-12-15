package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.printList();
        myLinkedList.append(4);

        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
    }
}
