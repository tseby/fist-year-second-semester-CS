package POLITEX;
import POLITEX.bubblesort.BubbleSortingArray;
import POLITEX.bubblesort.Utility;
import POLITEX.bubblesort.SelectSortingArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RandMethodTest {



    @Test
    public void IfAddedNElementsThenArrayIsOfNSize() {
        int[] test_array =  Utility.getRandomNumber(0,26);
        Assertions.assertEquals(26,test_array.length);
        for (int i: test_array
             ) {
            System.out.println(i);
        }
    }

    @Test
    public void TestingBubbleSortingAlorithm(){
        int[] test_array = {5,8,2,4,9,3};
        BubbleSortingArray.BubbleSorting(test_array);
        Assertions.assertFalse(test_array[0]>test_array[5]);
        Assertions.assertEquals(2,test_array[0]);
    }

    @Test
    public void TestingSelectSortingAlgorith(){
        int[] test_array = {5,8,2,4,9,3,1};
        SelectSortingArray.selectSorting(test_array);
        Assertions.assertFalse(test_array[0]>test_array[6]);
        Assertions.assertEquals(1,test_array[0]);
    }

}