package queuesudungmang;

public class MyQueueClient {
    public static void main(String[] args) {
        MyQueue number=new MyQueue(4);
        number.enqueue(4);
        number.dequeue();
        number.enqueue(56);
        number.enqueue(2);
        number.enqueue(67);
        number.dequeue();
        number.dequeue();
        number.enqueue(24);
        number.dequeue();
        number.enqueue(98);
        number.enqueue(45);
        number.enqueue(23);
        number.enqueue(435);
    }
}
