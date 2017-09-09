package program6;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args){

        String [] originalArray={"horse","horse","horse","horse", "dog", "cat","cat","cat", "horse","dog"};
        String[] tempArrray=originalArray;
        int size =tempArrray.length;

        System.out.println("original array---->>>>>"+Arrays.toString(originalArray));

        //shifting the unique array elements in the left side
        for (int i=0; i< size; i++){
            for(int j=i+1; j<size;){
                if(tempArrray[j].equalsIgnoreCase(tempArrray[i])){
                   for(int k=j; k<size-1; k++){
                       tempArrray[k]=tempArrray[k+1];
                   }
                   size--;
                }else{
                    j++;
                }
            }
        }

        String [] finalArray=new String[size];

        for (int i=0;i<size;i++){
            finalArray[i]=tempArrray[i];
        }

        System.out.println("final Array--->>>>"+Arrays.toString(finalArray));

    }
}

/*output
* original array---->>>>>[horse, horse, horse, horse, dog, cat, cat, cat, horse, dog]
  final Array--->>>>[horse, dog, cat]*/
