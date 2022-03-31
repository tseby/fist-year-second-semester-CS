package POLITEX_sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandMethod {

    public static int[] getRandomNumber(int min, int max) {
        List<Integer> list_to_array = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            Random random = new Random();
            list_to_array.add(random.nextInt(max - min) + min);
        }
        return list_to_array.stream().mapToInt(i->i).toArray();
    }
}