class NewThread implements Runnable{
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
    }

    public void run() {
        try{
            for(int i=5; i>0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}

class MThNewThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread();

        nt.t.start();

        try{
            for(int i=5; i>0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}
