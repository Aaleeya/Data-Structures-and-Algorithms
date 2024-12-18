package leetcodeProblems.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList1 myLinkedList = new LinkedList1(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);


        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);


        myLinkedList.append(6);


        System.out.println("===========================");
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println("Middle Node: " + myLinkedList.findMiddleNode().value);

        //------------------------------------------------
        LinkedListUsingLength myLinkedList1 = new LinkedListUsingLength(1);
        myLinkedList1.append(2);
        myLinkedList1.append(3);
        myLinkedList1.append(4);
        myLinkedList1.append(5);

        // create a loop by connecting the tail to the second node
        myLinkedList1.getTail().next = myLinkedList1.getHead().next;


        System.out.println("Has Loop:");
        System.out.println( myLinkedList1.hasLoop());



    }
}
