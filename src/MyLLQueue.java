import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLLQueue<E> implements MyQueue<E> {
    // Queue implementation backed by Java Linked list class
    private LinkedList<E> data; // list
    private static final int DEFAULT_LENGTH = 10; // default length
    private int size; // size of queue
    private int capacity; // capacity of queue

    public MyLLQueue(){
        this(DEFAULT_LENGTH);
    }

    // A constructor that allows the user to select the initial size of the LinkedList
    public MyLLQueue(int capacity){
        // specifies capacity and size of queue
        this.capacity = capacity;
        data = new LinkedList<>();

        size = 0;


    }

    @Override
    public E remove() {
        // temporary variable to store the removed element
        E temp;
        // if queue is empty throw exception
        if (size == 0) {
            throw new NoSuchElementException("Empty Queue");
        }

        // Remove the first element
        else {
            temp = data.removeFirst();
        }
        // return First element
        size--;
        return temp;
    }

    @Override
    public E element() {
        if (size == 0) {
            throw new NoSuchElementException("Empty Queue");
        }
        // return First
        return data.getFirst();
    }

    @Override
    public void add(E e) {
        // if queue full
        if  (size == capacity)  {
            throw new IndexOutOfBoundsException("Queue full");

        }
        // add to the end of queue

        else {
            data.addLast(e);
            size++;
        }
    }

    // returns size of queue
    @Override
    public int size() {
        return size;
    }
    // returns if queue is empty or not
    @Override
    public boolean isEmpty() {
        return size==0;
    }
    // prints queue
    @Override
    public void print() {
        System.out.println(data);

    }
}
