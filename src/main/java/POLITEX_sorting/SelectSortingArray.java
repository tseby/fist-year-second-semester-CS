package POLITEX_sorting;

public class SelectSortingArray {

    public static void selectSorting(int numbers[]){
        int min, tmp;
        int tries = 0;
        for(int i = 0; i < numbers.length-1; i++){
            min = i;
            for(int scan = i+1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {
                    min = scan;
                }
            }
                tmp = numbers[min];
                numbers[min] = numbers[i];
                numbers[i] = tmp;
                tries++;
            }
        System.out.println();
        for (int nums: numbers
        ) {
            System.out.print(nums + ",");
        }
        System.out.println("Количество пробегов до окончания сортировки: " + tries);
        }

}
