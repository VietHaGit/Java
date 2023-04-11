package Simple;

public class TestMultiPriority1 extends Thread {
    @Override
    public void run(){
        System.out.println("running thread:" + Thread.currentThread().getName());
        System.out.println("Muc do uu tien la:" + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        TestMultiPriority1 m = new TestMultiPriority1();
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        m.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.NORM_PRIORITY);
        m.start();
        m1.start();
        m2.start();
    }
}
