package prob1;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String [] args) throws MyException{

        try{
            System.out.println("Enter a number in range 1 to 100");
            Scanner in= new Scanner(System.in);
            int num = in.nextInt();
            if (num < 0 || num > 100) throw new MyException("Number is not in the range");

        }catch(MyException ex){
            System.out.println("Exception !!!");
            System.out.println(ex.getMessage());
        }

    }



}


//output
//
//        Enter a number in range 1 to 100
//        300
//        Exception !!!
//        Number is not in the range


