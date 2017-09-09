package program1;

public class Prog1 {
    public static void main(String[] args){

        final double PI= Math.PI;

        //prob1
        int x= RandomNumbers.getRandomInt(1,9);
        System.out.println("the random number generated is "+x);
        System.out.println(Math.pow(PI,x));

        //prob2
        int y=RandomNumbers.getRandomInt(3,14);
        System.out.println("the random number generated is "+y);
        System.out.println(Math.pow(y,PI));

    }
}

/*    output
the random number generated is 6
961.3891935753043
the random number generated is 13
3159.04819858571
....*/