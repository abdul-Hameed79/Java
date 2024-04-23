package CollegeManagementSystem;

// Course class representing a college course
class Course {
    private String name;
    private String courseId;
    private int credits;

    public Course(String name, String courseId, int credits) {
        this.name = name;
        this.courseId = courseId;
        this.credits = credits;
    }

    // Getters for course details
    public String getName() {
        return name;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getCredits() {
        return credits;
    }
}