package program2;

public class Prog2 {
    public static void main(String[] args){

        float x1= (float) 1.27;
        float x2= (float) 3.881;
        float x3= (float) 9.6;

        float sum = (x1+x2+x3);

        //prob1
        System.out.println((int)sum);

        //prob2
        System.out.println(Math.round(sum));
    }
}
/*output
14
15
*/
