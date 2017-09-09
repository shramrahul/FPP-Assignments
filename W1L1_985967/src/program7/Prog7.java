package program7;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Prog7 {
    public static void main(String [] args){
        int count=0;
        for (String item: args){
            System.out.println(item+" has "+item.length()+" characters");
            String init =item.substring(0,1);
            if (init.equalsIgnoreCase("A")){
                count++;
            }
        }
        System.out.println("Number of elements Starting with A is "+count);

    }
}

/*output
Nepal has 5 characters
Afgan has 5 characters
America has 7 characters
India has 5 characters
China has 5 characters
UK has 2 characters
australia has 9 characters
Number of elements Starting with A is 3
*/
