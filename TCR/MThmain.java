import java.lang.Thread;

class MThmain {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current Thread using getName(): " + t.getName());
        System.out.println("Current Thread: " + t);

        t.setName("New Name");
        System.out.println("Current Thread New Name using getName(): " + t.getName());
        System.out.println("Current Thread New Name: " + t);

        try {
            for(int n=5; n>0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
    }
}