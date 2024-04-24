package OOPS.Abstraction;

abstract class A {
    abstract public void fun1();
    abstract public void fun2();
}

class B extends A {
    @Override
    public void fun1() {
        System.out.println("fun1 output in B");
    }

    @Override
    public void fun2() {
        System.out.println("fun2 output in B");
    }
}

class C extends A {
    @Override
    public void fun1() {
        System.out.println("fun1 output in C");
    }

    @Override
    public void fun2() {
        System.out.println("fun2 output in C");
    }
}

// Main.java
public class Example {
   public static void main(String[] args) {

       // Create an object for B class
       B b = new B();

       // Display fun1 and fun2 data present in B class
       b.fun1();
       b.fun2();

       // seperate space
       System.out.println();

       // Create an object for C class
       C c = new C();
       
       // Display fun1 and fun2 data present C class
       c.fun1();
       c.fun2();    
   } 
}