package POLITEX_sorting;

import java.util.Random;

public class RandMethod {

    public static int randomizeAnArray(int max) {
        int min = 0;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }



}
