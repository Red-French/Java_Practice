package extend_thread;

class Runner extends Thread {
    public void run() {  // code will run in its own thread
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);

            try {  // Thread class has a static method called ‘sleep’
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
        Runner runner1 = new Runner();
        runner1.start();  // call start() of the Thread class (calling run() would run the code in the main thread)
        
        Runner runner2 = new Runner();  // create another thread
        runner2.start();
    }
}