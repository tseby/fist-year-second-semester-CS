package POLITEX_sorting;

public class BubbleSortingArray {

    public static void BubbleSorting(int numbers[]) {

        int count;
        do {
            count = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println();
        for (int nums: numbers
             ) {
            System.out.print(nums + ","+"h");
        }
    }
}
