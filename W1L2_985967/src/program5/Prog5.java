package program5;

import program1.RandomNumbers;

public class Prog5 {
    public static void main(String[] args){
        int [][] array=new int[4][4];

        //initialization of numbers
        for (int i=0; i<4;i++){
            for(int j=0;j<4;j++){
                array[i][j]= RandomNumbers.getRandomInt(1,99);
            }
        }

        for (int i=0; i<4;i++){
            for(int j=0;j<4;j++){
                if(i%2==1){
                    System.out.print("\t"+"+"+array[i][j]+"\t");

                }else {
                    System.out.print("\t"+" " + array[i][j] + "\t");
                }
            }
            System.out.println("");

            if(i%2==1){
                System.out.println("\t----\t----\t----\t----\n");
            }
        }
    }
}


/*output
     19		 66		 42		 44
	+87		+87		+87		+87
	----	----	----	----

	 93		 46		 99		 75
	+87		+87		+87		+87
	----	----	----	----*/
