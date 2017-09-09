package program2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lName = scanner.nextLine();

        System.out.print("Enter dob in format yyyy-M-d");
        String dob = scanner.nextLine();

        LocalDate lDob = LocalDate.parse(dob, formatter);
        HeartRates person = new HeartRates(fName, lName, lDob);

        System.out.println("\na. person's age: " + person.getAge());
        System.out.println("b. person's max heart rate: " + person.getMaxmimumHeartRate());
        System.out.println("c. person's target heart range: " + person.getheartRateRange());
        System.out.println("d. person's toString() data: " + person.toString());

        scanner.close();
    }

}