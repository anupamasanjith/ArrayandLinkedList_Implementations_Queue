import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // check if LLQueue & ArrayQueue work when an item is removed when queue is full then added.
        MyLLQueue<Integer> ltest1 = new MyLLQueue<>(3);
        ltest1.add(2);
        ltest1.add(4);
        ltest1.add(8);
        ltest1.remove();
        ltest1.add(16);
        ltest1.print();
        MyArrayQueue<Integer> atest1 = new MyArrayQueue<>(3);
        atest1.add(3);
        atest1.add(9);
        atest1.add(27);
        atest1.remove();
        atest1.add(81);
        atest1.print();

        // check if LLQueue & ArrayQueue work when queue is full then all elements are removed.
        MyLLQueue<String> ltest2 = new MyLLQueue<>(6);
        ltest2.add("This");
        ltest2.add("is");
        ltest2.add("a Test");
        ltest2.add("of My");
        ltest2.add("Queue");
        ltest2.add("Implementation");
        ltest2.print();
        ltest2.remove();
        ltest2.print();
        ltest2.remove();
        ltest2.print();
        ltest2.remove();
        ltest2.print();
        ltest2.remove();
        ltest2.print();
        ltest2.remove();
        ltest2.print();
        ltest2.remove();
        ltest2.print();
        MyArrayQueue<String> atest2 = new MyArrayQueue<>(6);
        atest2.add("The Four");
        atest2.add("Elements are");
        atest2.add("Fire");
        atest2.add("Water");
        atest2.add("Earth");
        atest2.add("Air");
        atest2.print();
        atest2.remove();
        atest2.print();
        atest2.remove();
        atest2.print();
        atest2.remove();
        atest2.print();
        atest2.remove();
        atest2.print();
        atest2.remove();
        atest2.print();
        atest2.remove();
        atest2.print();

        // check if LLQueue & ArrayQueue work when items are added and removed randomly.
        MyLLQueue<Integer> ltest3 = new MyLLQueue<>(5);
        ltest3.add(1);
        ltest3.add(2);
        ltest3.add(3);
       ltest3.remove();
       ltest3.remove();
       ltest3.add(2);
        ltest3.add(1);
        ltest3.remove();
        ltest3.remove();
        ltest3.remove();
        ltest3.add(1);
        ltest3.print();
        MyArrayQueue<Integer> atest3 = new MyArrayQueue<>(5);
        atest3.add(1000);
        atest3.add(2000);
        atest3.add(3000);
        atest3.remove();
        atest3.remove();
        atest3.add(2000);
        atest3.add(1000);
        atest3.remove();
        atest3.remove();
        atest3.remove();
        atest3.add(1000);
        atest3.print();

        // check if LLQueue & ArrayQueue recognize a full queue

        MyLLQueue<Integer> ltest4 = new MyLLQueue<>(3);
        ltest4.add(10);
        ltest4.add(20);
        ltest4.add(30);
        ltest4.add(80);
        MyArrayQueue<Integer> atest4 = new MyArrayQueue<>(3);
        atest4.add(10);
        atest4.add(20);
        atest4.add(30);
        atest4.add(80);























    }
}
