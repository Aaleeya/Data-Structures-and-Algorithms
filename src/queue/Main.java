package queue;

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(7);
        myQueue.enqueue(23);
        myQueue.enqueue(11);

        myQueue.dequeue();

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();
    }
}
