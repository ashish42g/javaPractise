package Queue;

public class ArrayLinearQueue implements Queue {

    private int front = -1, rear = -1;
    Object[] queue;

    public ArrayLinearQueue(int maxElements) {
        queue = new Object[maxElements];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return rear == queue.length - 1;
    }

    @Override
    public void insert(Object o) {
        if (rear == queue.length - 1)
            throw new FullQueueException();
        queue[++rear] = o;

    }

    @Override
    public Object remove() {
        if (front == rear)
            throw new EmptyQueueException();
        return queue[++front];

    }
}
