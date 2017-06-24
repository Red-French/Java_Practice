package runnable_interface;

class Runner implements Runnable {  // Runnable is an interface with only 1 method, run()
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);

            try {  // Thread has a static method called ‘sleep’
                Thread.sleep(100); // it can throw an interrupted exception, so wrap in try/catch
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[ ] args) {
        Thread t1 = new Thread(new Runner());  // declare instance of Thread class and pass it an instance of Runner class
        Thread t2 = new Thread(new Runner());  // create another thread
        t1.start();
        t2.start();
    }
}
