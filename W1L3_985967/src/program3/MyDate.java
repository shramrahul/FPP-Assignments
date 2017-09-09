package program3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class MyDate {

    static final String FORMAT_1 = "dd /MM /yyyy";
    static final String FORMAT_2 = "d MMM, yyyy";
    static final String FORMAT_3 = "D yyyy";


    private String outputInTheFormat_1;
    private String outputInTheFormat_2;
    private String outputInTheFormat_3;



    public MyDate() {
      }

    public MyDate(int day, int month, int year ) {
        LocalDate localDate=LocalDate.of(year, month, day);
        this.getGeneratedDates(localDate);

     }

    public MyDate(int day, String month,  int year) {
        LocalDate localDate=LocalDate.of(year, Month.valueOf(month.toUpperCase()),day);
        this.getGeneratedDates(localDate);
     }

    public MyDate(int year, int day) {
        LocalDate localDate=LocalDate.ofYearDay(year,day);
        this.getGeneratedDates(localDate);
     }

    public void getGeneratedDates(LocalDate localDate){
        this.outputInTheFormat_1=getDateInSpecifiedFormat(localDate,FORMAT_1);
        this.outputInTheFormat_2=getDateInSpecifiedFormat(localDate,FORMAT_2);
        this.outputInTheFormat_3=getDateInSpecifiedFormat(localDate,FORMAT_3);
      }



    public void displayOutputInTheFormats() {

        System.out.println("\n");
        System.out.println(this.outputInTheFormat_1);
        System.out.println(this.outputInTheFormat_2);
        System.out.println(this.outputInTheFormat_3);



     }

    public String getDateInSpecifiedFormat(LocalDate date,String format){
         DateTimeFormatter Formatter = DateTimeFormatter.ofPattern(format);
        return date.format(Formatter);
    }


    public static void main(String [] args) {
        int choice=0;
        //question a

        LocalDate date = LocalDate.now();
        MyDate myDate = new MyDate();

        System.out.println(myDate.getDateInSpecifiedFormat(date, FORMAT_1));
        System.out.println(myDate.getDateInSpecifiedFormat(date, FORMAT_2));
        System.out.println(myDate.getDateInSpecifiedFormat(date, FORMAT_3));


        //question b

        MyDate myDate1= new MyDate(21,9,1992);
        myDate1.displayOutputInTheFormats();

        MyDate myDate2=new MyDate(06,"June",1993);
        myDate2.displayOutputInTheFormats();

        MyDate myDate3= new MyDate(1993,300);
        myDate3.displayOutputInTheFormats();


        //question 3
        String wantToContinue="y";
        while(wantToContinue.equalsIgnoreCase("y")) {

        System.out.println("\nEnter 1 for format: MM/DD/YYYY\n" +
                "Enter 2 for format: Month DD, YYYY\n" +
                "Enter 3 for format: DDD YYYY\n" +
                "Enter 4 to exit");

        System.out.println("Enter your choice : ");
        Scanner in= new Scanner(System.in);

         choice=in.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter year: ");
                    int year1 = in.nextInt();

                    System.out.println("Enter month :");
                    int month1 = in.nextInt();

                    System.out.println("Enter day");
                    int day1 = in.nextInt();

                    MyDate myDateOne = new MyDate(day1, month1, year1);
                    myDateOne.displayOutputInTheFormats();

                    break;

                case 2:
                    System.out.println("Enter day :");
                    int day2 = in.nextInt();

                    System.out.println("Enter month :");
                    String month2 = in.next();

                    System.out.println("Enter year: ");
                    int year2 = in.nextInt();


                    MyDate myDateTwo = new MyDate(day2, month2, year2);
                    myDateTwo.displayOutputInTheFormats();

                    break;

                case 3:
                    System.out.println("Enter year: ");
                    int year3 = in.nextInt();

                    System.out.println("Enter day");
                    int day3 = in.nextInt();

                    MyDate myDateThree = new MyDate(year3, day3);
                    myDateThree.displayOutputInTheFormats();
                    break;

                default:
                    System.out.println("Choose a valid choice: ");
            }
            System.out.println("Do you Want To Continue: ");

            wantToContinue=in.next();

        }
        System.out.println("Terminated..");

    }



}

/*
question a

08 /09 /2017
8 Sep, 2017
251 2017

question b

21 /09 /1992
21 Sep, 1992
265 1992


06 /06 /1993
6 Jun, 1993
157 1993


27 /10 /1993
27 Oct, 1993
300 1993

question c

Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Enter your choice :
1
Enter year:
1998
Enter month :
2
Enter day
3


03 /02 /1998
3 Feb, 1998
34 1998
Do you Want To Continue:
y

Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Enter your choice :
2
Enter day :
2
Enter month :
june
Enter year:
1998


02 /06 /1998
2 Jun, 1998
153 1998
Do you Want To Continue:
y

Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to exit
Enter your choice :
3
Enter year:
1998
Enter day
300


27 /10 /1998
27 Oct, 1998
300 1998
Do you Want To Continue:
n

Terminated..
*/