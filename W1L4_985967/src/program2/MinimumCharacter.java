package program2;

public class MinimumCharacter {
    public static void main(String []args){
    String string="";

        System.out.println();
}

public String findMinimumCharacter(String str){
        char s="z";
        return findMinimumCharacter(s,str);
}
private char findMinimumCharacter(char s,String str){
    if(str.charAt(0)<s){
        s=str.charAt(0);
        findMinimumCharacter(s,str.substring(1));
    }
    return s;
}

}
