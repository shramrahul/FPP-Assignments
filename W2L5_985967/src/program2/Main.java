package program2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Professor professor;
        Secretary secretary;
        DeptEmployee[] department = new DeptEmployee[5];
        Scanner in=new Scanner(System.in);

        professor= new Professor(30000);
        professor.setName("Shreeram");
        professor.setHiredDate(LocalDate.of(1998, 2,23));
        department[0]=professor;

        professor= new Professor(50000);
        professor.setName("Adam");
        professor.setHiredDate(LocalDate.of(1992,3,4));
        department[1]=professor;

        professor= new Professor(70000);
        professor.setName("Tom");
        professor.setHiredDate(LocalDate.of(1990, 2, 5));
        department[2]=professor;

        secretary= new Secretary(15000,5);
        secretary.setName("Jack");
        secretary.setHiredDate(LocalDate.of(1995,8,23));
        department[3]=secretary;

        secretary= new Secretary(20000,10);
        secretary.setName("Peter");
        secretary.setHiredDate(LocalDate.of(1994,12,3));
        department[4]=secretary;

        System.out.println("do you wishes to see the sum of all Professor salary, sum of all secretary salary\n" +
                "and all salaries in the department ?? ");
        String choice=in.next();

        if (choice.equalsIgnoreCase("y")){

            double totalProfessorSalary=0.0;
            double totalSecretarySalary=0.0;
            double totalDepartmentSalary=0.0;

            for (DeptEmployee depart:department) {
                totalDepartmentSalary+=depart.computeSalary();

                if(depart instanceof Professor)
                    totalProfessorSalary+=depart.computeSalary();
                else
                    totalSecretarySalary+=depart.computeSalary();
            }

            System.out.println("Total salary of professors is "+totalProfessorSalary);
            System.out.println("Total salary of Secretary is "+totalSecretarySalary);
            System.out.println("Total salary of Department is "+totalDepartmentSalary);

        }

        System.out.println("Thank you !!!");


    }
}
