package org.example.conc2;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
