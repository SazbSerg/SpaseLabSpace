package QuickSortAlgorithm;

import java.util.Arrays;

public class QuickSortApp {
    public static void main(String[] args) {
        QuickSort quickSort1 = new QuickSort();
        int[] x = {1, 3, -5, 15, -9};
        System.out.println("Было");
        //System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort1.quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));

    }
}
