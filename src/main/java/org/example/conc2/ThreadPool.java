package org.example.conc2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        NumberPrinter np=new NumberPrinter();
//        Thread t=new Thread(np);
//        np.run();

        ExecutorService es = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            es.execute(np);
        }
        es.shutdown();
    }
}
