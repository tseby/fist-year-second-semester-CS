package POLITEX.bubblesort;

import java.util.Scanner;

public class Main{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("""
                Choose sorting method
                1)Select sort
                2)Bubble sort
                """);
        int sorting_choice = scanner.nextInt();
        System.out.print("""
                Size of the array of numbers:
                1) 26
                2) 52
                3) 104
                4) 208
                5) 416
                6) 832
                7) 1664
                """);
        int sorting_size = scanner.nextInt();
        switch (sorting_size){
            case 1 -> sorting_size = 26;
            case 2 -> sorting_size = 56;
            case 3 -> sorting_size = 104;
            case 4 -> sorting_size = 208;
            case 5 -> sorting_size = 416;
            case 6 -> sorting_size = 832;
            case 7 -> sorting_size = 1664;
        }

        switch (sorting_choice) {
           case 1 -> SelectSortingArray.selectSorting(Utility.getRandomNumber(0,sorting_size));
           case 2 -> BubbleSortingArray.BubbleSorting(Utility.getRandomNumber(0,sorting_size));
        }

    }
}
