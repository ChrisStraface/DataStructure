public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.put("Chris");
        queue.put("Straface");
        queue.put("Hernandez");
        Object name1 = queue.get();
        System.out.println(name1);
        Object name2 = queue.get();
        System.out.println(name2);
        Object name3 = queue.get();
        System.out.println(name3);

        for (int i = 0; i < 100; i = i + 1) {
            queue.put(i);
        }

        for (int i = 0; i < 100; i = i + 1) {
            Object obj2 = queue.get();
            System.out.println(obj2);
        }
        for (int i = 0; i < 5; i = i + 1) {
            queue.put(i);
        }
        for (int i = 0; i < 5; i = i + 1) {
            Object obj2 = queue.get();
            System.out.println(obj2);
        }
    }

}