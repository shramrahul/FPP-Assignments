package program4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    @Test
    public void checkPalindrome() throws Exception {
        String originalString= CheckPalindrome.ORIGINAL_STRING;
        String reversedString=new CheckPalindrome().getReversedString(originalString);
        assertEquals(originalString,reversedString);
    }

}