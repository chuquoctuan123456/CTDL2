package hw4_21000710_chuquoctuan.ex4;

public class TestEx4 {
    public static void main(String[] args) {
        arrayQueue();
        linkedListQueue();
    }
    public static void arrayQueue(){
        QueueInterface<Integer> queueInterface = new ArrayQueue<>();
        queueInterface.enqueue(5);
        queueInterface.enqueue(6);
        queueInterface.enqueue(9);
        queueInterface.enqueue(2);
        queueInterface.enqueue(1);

        queueInterface.dequeue();
        queueInterface.dequeue();
        queueInterface.dequeue();
        queueInterface.dequeue();

        queueInterface.print();

    }
    public static void linkedListQueue(){
        QueueInterface<Integer> queueInterface = new ArrayQueue<>();
        queueInterface.enqueue(5);
        queueInterface.enqueue(6);
        queueInterface.enqueue(9);
        queueInterface.enqueue(2);
        queueInterface.enqueue(1);

        queueInterface.dequeue();
        queueInterface.dequeue();

        queueInterface.print();

    }
}
