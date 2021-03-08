package homeExamples;

public class WorkArrays {
    // Создать массив на n элементов
    public static int[] createMus(int n) {
        int[] mus = new int[n];
        for (int i = 0; i < mus.length; i++) {
            mus[i] = (int) (Math.random()*100);
        }
        return mus;
    }

    // Вывод массива на экран
    public static void printMus(String str, int[] mus) {
        System.out.println(str);
        for (int value : mus) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
