public class Queue implements DataStructure {
    Object[] objects = new Object[100];
    int count = 0;
    int nextGet = 0;
    int nextPut = 0;

   synchronized public boolean put(Object obj) {
        if (count < 100) {
            objects[nextPut] = obj;
            if (nextPut < 99 ) {
                nextPut = nextPut + 1;
            } else {
                nextPut = 0;
            }
            count = count + 1;
            return true;
        } else {
            return false;
        }
    }
    synchronized public Object get() {
        if (count > 0) {
        Object obj = objects[nextGet];
            if (nextGet < 99) {
            nextGet = nextGet + 1;
        } else {
            nextGet = 0;
        }
        count = count - 1;
        return obj;
        } else {
            return null;
        }
    }
    public void run() {

    }
}
