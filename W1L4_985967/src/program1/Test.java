package program1;

import java.util.Arrays;

public class Test {
    public static void main(String []args){
        String str1="abc";
        String str2="def";
        System.out.println(new Test().mergeStrings(str1,str2));
    }

    public String mergeStrings(String str1, String str2){
        String str="";
        if(str1.isEmpty()||str2.isEmpty()){
            return str1+str2;
        }
        if (str1.charAt(0)>str2.charAt(0)) str=str2.charAt(0)+""+str1.charAt(0);
        else str=str1.charAt(0)+""+str2.charAt(0);
        return  str+""+mergeStrings(str1.substring(1),str2.substring(1));

    }

}

/*output

  adbecf
* */
