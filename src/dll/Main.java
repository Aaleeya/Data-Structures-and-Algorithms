package dll;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.prepend(0);
        myDLL.append(3);
       // myDLL.removeFirst();
       // myDLL.removeLast();
        myDLL.printList();
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(3).value);

    }
}
