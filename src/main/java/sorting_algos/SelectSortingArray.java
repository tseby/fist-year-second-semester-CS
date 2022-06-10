package sorting_algos;
import org.springframework.util.StopWatch;
public class SelectSortingArray {
    public static void selectSorting(int numbers[]) {
        for (int nums : numbers
        ) {
            System.out.print(nums + ",");
        }
        int moves = 0;
        int equalitions = 0;
        int min, tmp;
        for (int i = 0; i < numbers.length - 1; i++) {

            min = i;
            for (int scan = i + 1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {
                    equalitions++;
                    min = scan;
                    equalitions++;
                }
            }
            tmp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = tmp;
        }
        System.out.println();

        for (int nums : numbers
        ) {
            System.out.print(nums + ",");
            moves++;
        }
        System.out.println("\n");

        System.out.println("Число перестановок " + equalitions + "; " + "Число сравнений "+ moves);
    }
}
