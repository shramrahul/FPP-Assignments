package program2;

import program3.BinarySearch;

public class MinimumCharacter {
    public static void main(String []args){
    String string="MhrishiUniversityOfManagement";
    System.out.println(new MinimumCharacter().findMinimumCharacter(string.toLowerCase()));
}

public char findMinimumCharacter(String str){
        return findMinimumCharacter(str.charAt(0),str);
}
private char findMinimumCharacter(char s,String str){
   if (str.isEmpty()) return s;
    else if(str.charAt(0)<s){
        s=str.charAt(0);
    }
    return findMinimumCharacter(s,str.substring(1));

 }
}

/*output
 a

 */