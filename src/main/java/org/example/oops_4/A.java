package org.example.oops_4;

import java.util.Random;

public class A {
   void show(){
       System.out.println("Show A");
   }
}
class B extends A{
    @Override()
    void show(){
        System.out.println("Show B");
    }
}

class C extends B{
    @Override()
    void show(){
        System.out.println("Show C");
    }
}