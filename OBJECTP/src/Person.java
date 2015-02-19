public class Person {
    protected String name;
    protected int age;

    public Person() {}

    public Person(String name) {
        setName(name);
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Person(int age, String name) {
        setName(name);
        setAge(age);
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }

    public void celebrateBday() {
        this.age++;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int n) {
        if (n > 0)
            this.age = n;
        else
            this.age = 0;
    }
}