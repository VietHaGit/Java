package Simple;

public class ThreadSimple extends Thread {
    @Override
    public void run(){
        System.out.println("thread is running.....");
    }
    public static void main(String[] args) {

        ThreadSimple threadSimple = new ThreadSimple();
        threadSimple.start();
    }
}
