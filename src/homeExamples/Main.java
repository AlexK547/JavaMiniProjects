package homeExamples;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = 20;
        int [] mus = createMus(number);

        printMus("Array: ", mus);

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

    // Вывод массива на экран
    public static void printMus(String str, int[] mus) {
        System.out.println(str);
        for (int value : mus) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Создать массив на n элементов
    public static int[] createMus(int n) {
        int[] mus = new int[n];
        for (int i = 0; i < mus.length; i++) {
            mus[i] = (int) (Math.random()*100);
        }
        return mus;
    }

    // Сортировка массива пузырьком
    public static void simpleSort(int[] mus) {
        for (int i = mus.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mus[j] > mus[j+1]) {
                    int temp = mus[j];
                    mus[j] = mus[j+1];
                    mus[j+1] = temp;
                }
            }
        }
    }

    // Быстрая сортировка
    public static void quickSort (int mus[], int low, int high) {
        if (mus.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low)/2;
        int support = mus[middle];
        int i = low, j = high;

        while (i < j) {
            while (mus[i] < support) {
                i++;
            }
            while (mus[j] > support) {
                j--;
            }

            if (i <= j) {
                int temp = mus[i];
                mus[i] = mus[j];
                mus[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(mus, low, j);
        }
        if (high > i) {
            quickSort(mus, i, high);
        }
    }

}
