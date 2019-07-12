package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        String introduction = super.introduce();
        if (this.klass == 0) {
            return introduction + " I am a Teacher. I teach No Class.";
        }
        return introduction + " I am a Teacher. I teach Class " + this.klass + ".";
    }
}
