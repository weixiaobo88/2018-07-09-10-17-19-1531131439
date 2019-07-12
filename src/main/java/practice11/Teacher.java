package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for(Klass klass : classes) { klass.attachTeacher(this);}
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String introduction = super.introduce();

        if (null == this.classes) {
            return introduction +  " I am a Teacher. I teach No Class.";
        }

        return introduction +  " I am a Teacher. I teach Class " + this.getFormattedClasses() + ".";
    }

    private String getFormattedClasses() {
        String result = "";
        for (Klass klass : classes) {
            if (classes.indexOf(klass) == classes.size() -1 ) {
                result += klass.getNumber();
            } else {
                result += klass.getNumber() + ", ";
            }
        }
        return result;
    }

    public String introduceWith(Student student) {
        String introduction = super.introduce();
        if (isTeaching(student)) {
            return introduction +  " I am a Teacher. I teach " + student.getName() + ".";
        }
        return introduction +  " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public LinkedList<Klass> getClasses() {
        return this.classes;
    }

    public boolean isTeaching(Student student) {
        Klass studentKlass = student.getKlass();

        return classes.contains(studentKlass);
    }

    void receiveNotifyOnAppendMember(Student student, Klass klass) {
        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " has joined " + klass.getDisplayName() + ".");
    }

    void receiveNotifyOnAssignLeader(Student student, Klass klass) {
        System.out.println("I am " + this.getName() + ". I know " + student.getName() + " become Leader of " + klass.getDisplayName() + ".");
    }
}

