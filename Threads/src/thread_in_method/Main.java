package thread_in_method;

public class Main {
    public static void main(String[ ] args) {
        Thread t1 = new Thread(new Runnable() {  // declare instance of Thread class; pass it an instance of Runnable interface

            @Override
            public void run() {  // implement Runnable’s run() method
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
        });

        t1.start();
    }
}
