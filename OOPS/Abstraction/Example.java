package OOPS.Abstraction;

abstract class A {
    abstract public void fun1();
    abstract public void fun2();
}

class B extends A {
    @Override
    public void fun1() {
        System.out.println("fun1 output");
    }
    public void fun2() {
        System.out.println("fun2 output");
    }
}

class C extends A {
    @Override
    public void fun1() {
        System.out.println("fun1 another output");
    }
    public void fun2() {
        System.out.println("fun2 another output");
    }
}

// Main.java
public class Example {
   public static void main(String[] args) {

       // Create object for B
       B b = new B();

       // Display fun1 and fun2 data in B class
       b.fun1();
       b.fun2();

       // seperate space
       System.out.println();

       // Create object for C
       C c = new C();
       
       // Display fun1 and fun2 data in C class
       c.fun1();
       c.fun2();    
   } 
}