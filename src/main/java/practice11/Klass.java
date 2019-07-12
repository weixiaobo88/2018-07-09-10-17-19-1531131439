package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> students = new ArrayList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();

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
            this.notifyTeacherOnAssignLeader(student, this);
        } else {
            System.out.println("It is not one of us.");
        }
    }

    private void notifyTeacherOnAssignLeader(Student student, Klass klass) {
        for (Teacher teacher : teachers) {
            teacher.receiveNotifyOnAssignLeader(student, klass);
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        this.students.add(student);
        this.notifyTeachersOnAppendMember(student, this);
    }

    private void notifyTeachersOnAppendMember(Student student, Klass klass) {
        for (Teacher teacher : teachers) {
            teacher.receiveNotifyOnAppendMember(student, klass);
        }
    }

    void attachTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

}
