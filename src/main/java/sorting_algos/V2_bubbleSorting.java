package sorting_algos;

import java.util.Arrays;

public class V2_bubbleSorting {

    public static void BubbleSort(int numbers[]) {
        for (int nums : numbers
        ) {
            System.out.print(nums + ",");
        }
        System.out.println("\n");
        int moves = 0;
        int equalitions = 0;
        boolean isSorted = false;
        int buf;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                moves++;
                if(numbers[i] > numbers[i+1]){
                    isSorted = false;

                    buf = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = buf;
                    equalitions++;
                }
            }
        }
        for (int nums : numbers
        ) {
            System.out.print(nums + ",");
        }
        System.out.println("Перестановки "+ equalitions+", "+ " Сравнения "+ moves);
    }


    
}
