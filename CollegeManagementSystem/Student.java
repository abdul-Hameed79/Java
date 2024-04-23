package CollegeManagementSystem;

import java.util.ArrayList;

class Student extends Person {
    private String studentId;
    private ArrayList<String> coursesEnrolled;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        coursesEnrolled.add(course);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("Name: " + super.getDetails() + ",  Student ID: " + studentId + " ,  Enrolled Courses: ");
        for (String course : coursesEnrolled) {
            details.append(course);
        }
        return details.toString();
    }
}