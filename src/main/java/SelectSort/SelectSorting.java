package SelectSort;

public class SelectSorting {

    public static void main(String[] args) {
        int array[] = {5,4,2,7,8,1};
        System.out.println("Неотсортированный массив");
        for (int i: array) {System.out.print(i + ",");}
        System.out.println();

        selectSort(array);
        System.out.println("Мой отсортированный масив");
        for (int i: array
             ) {
            System.out.print(i +",");
        }
    }


    public static void selectSort(int numbers[]){
        int min, tmp;
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
            }
        }

}
