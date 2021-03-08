package homeExamples;

import static homeExamples.WorkArrays.*;
import static homeExamples.Sort.*;

public class Main {

    public static void main(String[] args) {
        int number = 20;
        int [] mus = createMus(number);
        printMus("Array: ", mus);
        // Поиск минимального числа
        System.out.println("Minimum number: " + findMin(mus));

        // Сортировка пузырьком
        simpleSort(mus);
        printMus("Sorted array: ", mus);

        System.out.println();
        int [] mus1 = createMus(number);
        printMus("Array: ", mus1);

        // Быстрая сортировка
        quickSort(mus1, 0, mus1.length - 1);
        printMus("Sorted array: ", mus1);

    }

}