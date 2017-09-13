package deepClone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Auto-generated method stub

        Person person1 = new Person("person1", new Computer("Dell", "i7", 16, 2, 3122.77));
        System.out.println("Before copying person1, person1: \n"+ person1);

        Person person2 = (Person) person1.clone();
        System.out.println("After copying person1, person2: \n"+ person2);


        person1.getComputer().setManufacturer("HP");
        System.out.println("\nEdited value of computer in person1");
        System.out.println("new values of person1: \n"+ person1);
        System.out.println("Changed value due to shallow copy in person2: \n" + person2);
    }

}
