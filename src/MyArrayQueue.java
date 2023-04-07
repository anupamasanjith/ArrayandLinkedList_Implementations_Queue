
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

// Queue implementation backed by array

public class MyArrayQueue<E> implements MyQueue<E> {

    private E[] data; // backing array
    private int head; // head of queue
    private int tail; // tail of queue
    private int size; // size of queue

    private static final int DEFAULT_LENGTH = 10; // default length

    public MyArrayQueue() {
        // call the other constructor with length 10
        this(DEFAULT_LENGTH);
    }

    @SuppressWarnings("unchecked") // get rid of unchecked warning

    // A constructor that allows the user to select the initial size of the backing array
    public MyArrayQueue(int capacity) {
        size = 0;


        // construct an array of object and cast it to an array of E's
        data = (E[]) new Object[capacity];
        head = -1;
        tail = -1;

    }
    @Override
    public E remove() {
        E temp;

        // if queue is empty throw exception
        if (size == 0) {
            throw new NoSuchElementException("Empty Queue");
        }
        // if only one element in queue revert head and tail back to -1
        else if (head == tail) {
            temp = data[head];
            data[head] = null;
            head = -1;
            tail = -1;

        }
        // else position of head is head+1 % capacity of queue
        // Just like Clock Arithmetic.
        else {
            temp = data[head];
            data[head] = null;
            head = (head+1) % data.length;


        }
        // return element at head
        size--;
        return temp;
    }

    @Override
    public E element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        // return element at head

        return data[head];
    }

    @Override
    public void add(E e) {
        // if no elements have been added to queue
        if (size == 0 && head == tail) {
            head++;
            tail++;
            data[tail] = e;
            size++;
            // if position of tail right behind head no more elements can be added
        } else if ((tail+1) % (data.length) == head) {

            throw new IndexOutOfBoundsException("Queue full");
        }
        else {
            // else position of tail is tail+1 % capacity of queue
            // Just like Clock Arithmetic.

            tail = (tail + 1) % data.length;
            data[tail] = e;
            size++;
        }
    }

    @Override
    // returns size of queue
    public int size() {
        return size;
    }
    // returns if queue is empty or not
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    // prints queue
    public void print() {
        System.out.println(Arrays.toString(data));

    }
}
