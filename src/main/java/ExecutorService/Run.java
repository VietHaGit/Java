package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Run implements Runnable {
//    int id;
//    public Run(int id){
//        this.id=id;
//    }
//
//    @Override
//    public void run(){
//        System.out.println("tien trinh dang duoc thuc thi" + id);
//        try {
//            Thread.sleep(500);
//
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        System.out.println(" tien trinh da duoc thuc thi:" + id);
//    }
//    @Override
//    public void run() {
//        Runnable runnableTask = () -> {
//            try {
//                TimeUnit.MILLISECONDS.sleep(300);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//

//    }
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
}
