package BinarySearching;

import java.util.Arrays;

public class BinarySearchingMethod {
    //int[] array = {3,5,3,7,7,8,12,44,66,43,6,2,8};

    public int search(int[] array, int n){
        Arrays.sort(array);
        int min = 0;
        int max = array.length-1;

        while (min<=max){
            int mid = min + (max - min)/2;

            if (n < array[mid]){
                max = mid - 1;
            } else if (n > array[mid]){
                min = mid + 1;
            } else return mid;
        }
        return -1;
    }
}
