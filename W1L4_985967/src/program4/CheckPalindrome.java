package program4;

import com.sun.org.apache.xpath.internal.SourceTree;

public class CheckPalindrome {


    public static final String ORIGINAL_STRING="aba";


    public static void main(String [] args){
        CheckPalindrome checkPalindrome= new CheckPalindrome();
        String reversedString = checkPalindrome.getReversedString(ORIGINAL_STRING);
        if(ORIGINAL_STRING.equalsIgnoreCase(reversedString)){
            System.out.println( ORIGINAL_STRING+" is string is palindrome");
        }
    }

    public String getReversedString(String str){
            return getReversedString( str,str.length()-1, "");
    }

    private String getReversedString(String str, int index, String pal){
        if (index<0){
            return pal;
        }
        pal+=str.charAt(index);
        return getReversedString(str,index-1, pal);
    }
}

/*output
 aba is string is palindrome
 */
