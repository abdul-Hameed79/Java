package CollegeManagementSystem;

// Main.java
public class Main {
    public static void main(String[] args) {
        Student Hameed = new Student("Hameed", "S001");
        Student Nazeer = new Student("Nazeer", "S002");
        Student Akmal = new Student("Akmal", "S003");

        Professor Dean = new Professor("Sliva Reddy", "P001");

        Hameed.enrollCourse("CSE");
        Nazeer.enrollCourse("ECE");
        Akmal.enrollCourse("MECH");

        Dean.addSubject("FUEE");

        // display student details
        System.out.println("\nStudent Details: ");
        System.out.println(Hameed.getDetails() + "\n" + Nazeer.getDetails() + "\n" + Akmal.getDetails());
       
        System.out.println();
        
        // display professor details
        System.out.println("Professor Details: ");
        System.out.println(Dean.getDetails());
    }
}