package homeExamples;

public class Sort {
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
        int left = low, right = high;

        while (left < right) {
            while (mus[left] < support) {
                left++;
            }
            while (mus[right] > support) {
                right--;
            }

            if (left <= right) {
                int temp = mus[left];
                mus[left] = mus[right];
                mus[right] = temp;
                left++;
                right--;
            }
        }

        if (low < right) {
            quickSort(mus, low, right);
        }
        if (high > left) {
            quickSort(mus, left, high);
        }
    }

}
