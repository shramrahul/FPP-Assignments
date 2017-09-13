package shallowClone;

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

/* output
Before copying person1, person1: 
shallowClone.Person [name=person1, computer=shallowClone.Computer{manufacturer='Dell', processor='i7', ramSize=16, diskSize=2, processorSpeed=3122.77}]
After copying person1, person2: 
shallowClone.Person [name=person1, computer=shallowClone.Computer{manufacturer='Dell', processor='i7', ramSize=16, diskSize=2, processorSpeed=3122.77}]

Edited value of computer in person1
new values of person1: 
shallowClone.Person [name=person1, computer=shallowClone.Computer{manufacturer='HP', processor='i7', ramSize=16, diskSize=2, processorSpeed=3122.77}]
Changed value due to shallow copy in person2: 
shallowClone.Person [name=person1, computer=shallowClone.Computer{manufacturer='HP', processor='i7', ramSize=16, diskSize=2, processorSpeed=3122.77}]
*/
