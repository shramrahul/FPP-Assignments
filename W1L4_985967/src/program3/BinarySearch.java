package program3;

public class BinarySearch {


    private static final int[] ARRAY = {1,2,3,4,7,8,10,11,12,13,14,22,13,14,15,16,27,28,29,30,31,32,33,34,35,36,37};
    private static final int SEARCH_KEY = 31;

    public static int[] getARRAY() {
        return ARRAY;
    }

    public static int getSearchKey() {
        return SEARCH_KEY;
    }



    public int searchElement(int[] arr, int item) {
        int l=0;
        int r= arr.length-1;
        return searchElement(arr, l, r, item);
    }

    private int searchElement(int[] arr, int l, int r, int key) {
        int mid=0;

        if(r%2==0) mid=(l+r)/2;
        else mid = (l + r+1) / 2;

        if(r > l) {
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] > key) {
                return searchElement(arr, l, mid+1, key);
            } else {
                return searchElement(arr, mid-1, r, key);
            }
        }
    return -1;
    }

    public static void main(String[] args) {

        System.out.println(new BinarySearch().searchElement(ARRAY, SEARCH_KEY));
    }
}

/*output
 31

 */
