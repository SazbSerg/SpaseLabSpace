package Practice;

import java.io.PrintStream;

public class MatrixPrint {
    public static void main(String args[]){
        int size = 5;
        int sum1, sum2 = 0;
        int[][] array;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum2 = sum2 + 1;
                sum1 = j + 1;
                if (sum1 == i+1|sum1 == size-i) {
                    System.out.printf("%4s", "*");
                    continue;
                }
                System.out.printf("%4d", sum2);
            }
            System.out.println();
        }
    }
}
