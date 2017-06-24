# Basic Threads
This illustrates two (and a half) ways to create and run multiple threads in Java.

  - extend Thread class
  - implement Runnable interface and pass it to the constructor of the Thread class
  - * can also run a method in its own thread without creating a separate class


## extending Thread class

```
class Runner extends Thread {
    public void run() {  // code will run in its own thread
        for(int i = 0; i < 10; i++) {
            System.out.println(“Hello “ + i);

            try {  // Thread class has a static method called ‘sleep’
                Thread.sleep(100); // it can throw an interrupted exception, so wrap in try/catch
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[ ] args) {
        Runner runner1 = new Runner();
        runner1.start();  // call start() of the Thread class (calling run() will run the code in the main thread)

        Runner runner2 = new Runner();  // create another thread
        runner2.start();
    }
}
```


## implement Runnable interface and pass it to the constructor of the Thread class

```
class Runner implements Runnable {  // Runnable is an interface with only 1 method, run()
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(“Hello “ + i);

            try {  // Thread has a static method called ‘sleep’
                Thread.sleep(100); // it can throw an interrupted exception, so wrap in try/catch
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[ ] args) {
        Thread t1 = new Thread(new Runner());  // declare instance of Thread class and pass it an instance of Runner class
        Thread t2 = new Thread(new Runner());  // create another thread
        t1.start();
        t2.start();
    }
}
```


## run method in its own thread without creating separate class

```
public class App {
    public static void main(String[ ] args) {
        Thread t1 = new Thread(new Runnable() {  // declare instance of Thread class; pass it an instance of Runnable interface

            @Override
            public void run() {  // implement Runnable’s run() method
                for(int i = 0; i < 10; i++) {
                    System.out.println(“Hello “ + i);

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
```
