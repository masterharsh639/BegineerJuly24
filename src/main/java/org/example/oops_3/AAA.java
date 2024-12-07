package org.example.oops_3;

public class AAA {
    public AAA(){
        System.out.println("AAA");
    }
}

class BBB extends AAA{
    public BBB(String s){
        System.out.println("BBB");
    }
}

 class CCC extends BBB{
     public CCC(){
         super("Hello");
         System.out.println("CCC");
     }
}