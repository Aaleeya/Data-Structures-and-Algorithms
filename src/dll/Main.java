package dll;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(23);
        myDLL.prepend(11);
       // myDLL.removeLast();
        myDLL.printList();
    }
}
