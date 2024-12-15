package org.example.conc1.example2;

public class OddPrinter implements Runnable{
    @Override()
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2!=0) {
                System.out.println(i +" odd thread ");
            }
        }
    }
}
