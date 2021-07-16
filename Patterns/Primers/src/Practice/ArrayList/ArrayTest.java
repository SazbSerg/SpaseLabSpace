package Practice.ArrayList;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i=0; i< x.length; i++){
            x[i]=i+1;
            System.out.println(x[i]);
        }

        ArrayList<Object> y = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            y.add(i+1);
        }

        y.remove(2);
        System.out.println(y);
        y.add(2, "love");
        System.out.println(y);

        for (Object z: y) {
            System.out.println(z);

        }
    }
}
