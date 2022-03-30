/*package CollectionBubbleSorting;

import POLITEX_sorting.RandMethod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


Размер массивов 26, 52, 104, 208, 416, 832, 1664
Сортировки: пузырьковая, отбор
Блок-схема: пузырьковая

public class SortingCollection {

    public static void main(String[] args) {

        RandMethod sort = new RandMethod();
        List<Integer> list_to_sort = new LinkedList<>();

        List<Integer> arra_list_to_sort = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            arra_list_to_sort.add(sort.getRandomNumber(1, 100,0));
        }

        for (int i = 0; i < arra_list_to_sort.size() - 1; i++) {
            if (arra_list_to_sort.get(i) > arra_list_to_sort.get(i + 1)) {
                int temp = arra_list_to_sort.get(i);
                int next_element = arra_list_to_sort.get(i + 1);
               // arra_list_to_sort.set(i -> next_element);

            } ;
        }

        for (int numbers : arra_list_to_sort) {
            System.out.println(arra_list_to_sort);
        }


    }
}
*/