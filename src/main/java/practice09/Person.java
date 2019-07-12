package practice09;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return this.id == person.id;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am "+ this.age +" years old.";
    }
}
