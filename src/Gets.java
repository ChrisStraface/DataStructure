public class Gets implements Runnable {
    Queue queue;
    public void run() {
        for (int i = 0; i < 100; i = i + 1) {
            Object obj2 = queue.get();
            System.out.println(obj2);
        }
        for (int i = 0; i < 5; i = i + 1) {
            Object obj2 = queue.get();
            System.out.println(obj2);
        }
    }
}
