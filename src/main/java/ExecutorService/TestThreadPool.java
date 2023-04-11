package ExecutorService;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class TestThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);

//        for (int i = 0; i < 10;i++){
//            pool.submit(new Run(i));
//        }
//        try {
//            pool.awaitTermination(1,TimeUnit.DAYS);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        pool.shutdown();
//    }

// ExecutorService using execute() method
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task1");
            }
        });
        executorService.execute(() -> System.out.println("Task2"));
        executorService.execute(() -> System.out.println("Task3"));
        executorService.shutdown();


//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("ExecutorService");
//            }
//        });


//        Future<T> future = executorService.submit(new Callable(){
//            public Object call() throws Exception {
//                System.out.println("Asynchronous Callable");
//                return T;
//            }
//        });
//
//        System.out.println("future.get() = " + future.get());
//    }

//ExecutorService using invokeAny()
//        Set<Callable<String>> callables = new HashSet<Callable<String>>();
//        callables.add(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "Task1";
//            }
//        });
//        callables.add(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                int b = 3 / 0;
//                return "Task 2";
//            }
//        });
//
//        callables.add(new Callable<String>() {
//            public String call() throws Exception {
//                return "Task 3";
//            }
//        });
//
//        String result = executorService.invokeAny(callables);
//
//        System.out.println("result = " + result);
//
//        executorService.shutdown();



//ExecutorService using invokeAll() method
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task1";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task2";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task3";
            }
        });
        List<Future<String>> futures = executorService.invokeAll(callables);
        for (Future<String> future:futures){
            System.out.println("future.get =" + future.get());
        }
        executorService.shutdown();
    }
}
