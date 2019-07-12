package practice09;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public void assignLeader(Student student) {
        if (this.students.contains(student)) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        this.students.add(student);
    }
}
