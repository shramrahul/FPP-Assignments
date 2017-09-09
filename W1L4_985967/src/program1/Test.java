package program1;

import java.util.Arrays;

public class Test {
    public static void main(String []args){
        String str1="ace";
        String str2="bdf";
        System.out.println(new Test().mergeStrings(str1,str2));
    }

    public String mergeStrings(String str1, String str2){
        String str="";
        return  mergeStrings( str1,  str2, str);

              //mergeStrings(str1.substring(1),str2.substring(1));

    }
    public String mergeStrings(String str1, String str2, String str){
        if(str1.length()==0) return str2;
        else if (str2.length()==0) return str1;
        else {
            str = str + str1.charAt(0) + "" + str2.charAt(0);
            mergeStrings(str1.substring(1), str2.substring(1));
        }
        return str;

    }
}
