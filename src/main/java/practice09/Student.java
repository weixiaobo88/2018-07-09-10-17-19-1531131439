package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        String klassName = this.klass.getDisplayName();
        String introduction = super.introduce();
        if (this.equals(this.klass.getLeader())) {
            return introduction + " I am a Student. I am Leader of " + klassName + ".";
        }
        return introduction + " I am a Student. I am at " + klassName + ".";
    }
}
