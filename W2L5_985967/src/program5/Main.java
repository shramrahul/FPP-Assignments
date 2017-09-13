package program5;

public class Main {
    public static void main(String [] args){
        Computer computer1= new Computer("Dell","i7",8,256, 2.5);
        Computer computer2= new Computer("Dell","i7",8,256, 2.5);
        Computer computer3= new Computer("Hp","i7",8,256, 2.5);

        System.out.println("computer1.toString()"+computer1.toString());
        System.out.println("computer2.toString()"+computer2.toString());
        System.out.println("computer3.toString()"+computer3.toString());
        System.out.println("\n");
        System.out.println("computer1.equals(computer2): "+computer1.equals(computer2));
        System.out.println("computer1.equals(computer3): "+computer1.equals(computer3));
        System.out.println("\n");
        System.out.println("Computer1.hashCode(): "+computer1.hashCode());
        System.out.println("Computer2.hashCode(): "+computer2.hashCode());
        System.out.println("Computer3.hashCode(): "+computer3.hashCode());

    }
}
