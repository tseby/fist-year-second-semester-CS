package POLITEX.bubblesort;

import org.springframework.util.StopWatch;

public class BubbleSortingArray {

    public static void BubbleSorting(int numbers[]) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int count = 0;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    count++;
                }
            }

        System.out.println();

        for (int nums : numbers
        ) {
            System.out.print(nums + ",");
        }
        stopWatch.stop();
        System.out.println("Количество пробегов до окончания сортировки: " + count);
        System.out.println("Сортировка заняла " + stopWatch.getTotalTimeMillis()+ " милисек.");
    }
}
