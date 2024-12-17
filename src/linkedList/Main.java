package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);
        //myLinkedList.printList();

//        System.out.println(myLinkedList.removeLast().value);
//        //myLinkedList.getLength();
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());
        myLinkedList.prepend(1);
        myLinkedList.removeFirst();
        myLinkedList.printList();

    }
}
