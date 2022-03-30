package POLITEX_sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandMethod {

    public static Integer[] getRandomNumber(int min, int max) {

        List<Integer> list_to_array = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            Random random = new Random();
            list_to_array.add(random.nextInt(max - min) + min);
        }

        Integer[] array_to_sort = new Integer[list_to_array.size()];
        list_to_array.toArray(array_to_sort);

        return array_to_sort;
    }

}
