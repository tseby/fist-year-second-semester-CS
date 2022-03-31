package POLITEX_sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandMethodTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getRandomNumber() {
        int[] test_array =  RandMethod.getRandomNumber(0,26);
        int size = test_array.length;
        assertEquals(26,size);
    }
}