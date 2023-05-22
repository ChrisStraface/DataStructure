public class Puts implements Runnable {
    Queue queue;
    public void run() {
        for (int i = 0; i < 100; i = i + 1) {
            queue.put(i);
        }
        for (int i = 0; i < 5; i = i + 1) {
            queue.put(i);
        }
    }
}
