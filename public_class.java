package thread; 

public class public_class {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);
        int maxItems = 10;

        Producer producer1 = new Producer(buffer, maxItems);
        Producer producer2 = new Producer(buffer, maxItems);
        Consumer consumer1 = new Consumer(buffer);
        Consumer consumer2 = new Consumer(buffer);

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
