package CollegeManagementSystem;

import java.util.ArrayList;

class Professor extends Person {
    private String professorId;
    private ArrayList<String> subjectsTeaching;

    public Professor(String name, String professorId) {
        super(name);
        this.professorId = professorId;
        this.subjectsTeaching = new ArrayList<>();
    }

    public void addSubject(String subject) {
        subjectsTeaching.add(subject);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("Name: " + super.getDetails() + ",  Professor ID: " + professorId + " ,  Teaching Subjects: ");
        for (String subject : subjectsTeaching) {
            details.append(subject);
        }
        return details.toString();
    }
}