package POLITEX_sorting;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("""
                Choose sorting method
                1)Bubble sorting;
                2)Select sort.
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

        switch (sorting_choice) {
           case 1 -> SelectSortingArray.selectSorting(RandMethod.getRandomNumber(0,sorting_size));
           case 2 -> BubbleSortingArray.BubbleSorting(RandMethod.getRandomNumber(0,sorting_size));
        }

    }
}
