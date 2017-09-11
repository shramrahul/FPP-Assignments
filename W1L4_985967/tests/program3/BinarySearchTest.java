package program3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    private BinarySearch binarySearch;
    @Test
    public void main() throws Exception {
        binarySearch=new BinarySearch();
        int key =BinarySearch.getSearchKey();
        int searchedKey=binarySearch.searchElement(BinarySearch.getARRAY(),key);
        assertEquals(key,searchedKey);
    }

}