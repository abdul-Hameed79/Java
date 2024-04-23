package OOPS.Polymorphism;

// Parent class
class MotorCycles {
    public void Method1() {
        System.out.println("Display method 1");
    }

    public void Method2() {
        System.out.println("Display method 2");
    }
}

// Child class
class Bullet extends MotorCycles {
    @Override
    public void Method1() {
        System.out.println("The Cost of bullet is very high");
    }
    @Override
    public void Method2() {
        System.out.println("It gives very less milage");
    }
}

// Child class
class Platina extends MotorCycles {
    @Override
    public void Method1() {
        System.out.println("The cost of platina is budget friendly");
    }
    @Override
    public void Method2() {
        System.out.println("It gives more milage when compare to bullet");
    }
}

class Display {
    public void Polymorphism(MotorCycles MC) {
        MC.Method1();
        MC.Method2();
        System.out.println();
    }
}

// Main.java
public class Example {
    public static void main(String[] args) {
       // Create a bullet object 
        Bullet bullet = new Bullet();
       // create a platina object
        Platina platina = new Platina();
        // create a display object
        Display display = new Display();

        // Display bullet data
        display.Polymorphism(bullet);
        // Display platina data
        display.Polymorphism(platina);
     
    }
}