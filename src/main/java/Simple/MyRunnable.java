package Simple;

import java.util.Arrays;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running in " + threadName);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void runThread(){
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setPriority(5);
        thread.setName("abcd");
        Thread thread1 = new Thread(myRunnable1);
        thread1.setPriority(1);
        thread1.setName("def");
        Arrays.asList(thread,thread1).parallelStream().forEach(Thread::start);
    }

    public static void main(String[] args) {
        runThread();
    }
}
