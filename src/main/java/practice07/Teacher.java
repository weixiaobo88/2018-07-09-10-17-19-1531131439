package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        String introduction = super.introduce();

        if (this.klass == null) {
            return introduction + " I am a Teacher. I teach No Class.";
        }
        return introduction + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
    }

    public String introduceWith(Student student) {
        String introduction = super.introduce();
        if (this.klass.getNumber() == student.getKlass().getNumber()) {
            return introduction + " I am a Teacher. I teach " +  student.getName() + ".";
        }
        return introduction + " I am a Teacher. I don't teach " +  student.getName() + ".";
    }
}
