package Program4;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Input a string to reverse--->>>>");
        String inputString= input.nextLine();
        String reversedString="";

        for(int i=inputString.length()-1; i>=0;i--){
            reversedString=reversedString+inputString.charAt(i);
        }

        System.out.println("The reversed string is--->>>> "+reversedString);
    }
}


/*output
* Input a string to reverse--->>>>
hello
The reversed string is--->>>> olleh*/
