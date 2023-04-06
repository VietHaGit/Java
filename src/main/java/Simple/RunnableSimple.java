package Simple;

public class RunnableSimple implements Runnable{
    @Override
    public void run(){
        System.out.println("this is running");
    }

    public static void main(String[] args) {
        RunnableSimple runnableSimple = new RunnableSimple();
        Thread thread = new Thread(runnableSimple);
        thread.start();
    }
}
