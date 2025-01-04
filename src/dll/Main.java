package dll;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);
       // myDLL.removeFirst();
       // myDLL.removeLast();
        myDLL.insert(1, 2);
        myDLL.remove(1);
        myDLL.remove(0);
        myDLL.printList();


    }
}
