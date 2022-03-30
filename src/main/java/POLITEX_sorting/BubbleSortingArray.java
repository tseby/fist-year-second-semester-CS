package POLITEX_sorting;

public class BubbleSortingArray {

    public static void BubbleSorting(String[] args) {
        int[] array = {2, 1, 6, 4, 8, 10, 9};
        int count;

        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println();
        for (int nums: array
             ) {
            System.out.println(nums + ",");
        }
    }
}
