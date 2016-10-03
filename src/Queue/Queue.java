package Queue;

public interface Queue {
    void insert(Object o);

    boolean isEmpty();

    boolean isFull();

    Object remove();
}
