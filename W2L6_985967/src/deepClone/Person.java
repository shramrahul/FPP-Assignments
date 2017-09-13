package deepClone;

public class Person implements Cloneable {
    private String name;
    private Computer computer;

    public Person(String name, Computer computer) {
        super();
        this.name = name;
        this.computer = computer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.computer = (Computer) this.computer.clone();

        return p;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", computer=" + computer + "]";
    }

}
