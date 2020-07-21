package queuesudungmang;

public class MyQueue {
    private int capacity;
    private int[] queueArray;
    private int head=0;
    private int tail=-1;
    private int currentSize=0;

    public MyQueue(int queueSize) {
        this.capacity=queueSize;
        queueArray=new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (this.currentSize==this.capacity)
            return true;
        return false;
    }

    public boolean isQueueEmpty() {
        if (this.currentSize==0)
            return true;
        return false;
    }

    public void enqueue(int element) {
        if (isQueueFull()) {
            System.out.println("Unable to add new element because queue is full");
        } else {
            tail++;
            if (tail==capacity-1) {
                tail=0;
            }
            queueArray[tail]=element;
            currentSize++;
            System.out.println("Element "+element+" is added into queue successfully.");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Unable to remove any element because queue is empty");
        } else {
            head++;
            if (head==capacity-1) {
                System.out.println("Remove operation have done: " + queueArray[head - 1]);
                head = 0;
            } else {
                System.out.println("Remove operation have done! Element was removed is: " + queueArray[head - 1]);
            }
            currentSize--;
        }
    }
}
