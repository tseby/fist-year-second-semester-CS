package sorting_algos;
import org.springframework.util.StopWatch;
public class BubbleSortingArray {
    public static void BubbleSorting(int numbers[]) {


        int moves = 0;
        int equalitions = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            equalitions++;
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                moves++;
            }
        }

        System.out.println();
        for (int nums : numbers
        ) {
            System.out.print(nums + ",");
        }

        System.out.println("Число перестановок "+moves + ";" + "Число сравнений "+equalitions);
    }
}
