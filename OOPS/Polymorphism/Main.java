package OOPS.Polymorphism;

// super class
class Animal {
    public void makesound() {
        System.out.println("Animal makes a sound");
    }
}

// sub class
class Dog extends Animal {
    public String name = "Bikshu Yadav";
    public void makesound() {
        System.out.println("Dog says: Bow Bow");
    }
}

// sub class
class Cat extends Animal {
    public String name = "Senorita";
    public void makesound() {
        System.out.println("cat says: Meow");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // create mydog & mycat objects
        Dog mydog = new Dog();
        Cat mycat = new Cat();

        // display dog name and barking sound
        System.out.println("\nDog name: " + mydog.name); 
        mydog.makesound();  

        // dispaly cat name & barking sound
        System.out.println("\nCat name: " + mycat.name);
        mycat.makesound();
    }
}