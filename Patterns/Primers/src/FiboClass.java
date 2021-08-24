public class FiboClass {
    void searchFibo(int n) {
        long[] searchArray = new long[n];
        searchArray[0] = 0;
        searchArray[1] = 1;
        for (int i = 2; i < searchArray.length; i++) {
            searchArray[i] = searchArray[i - 1] + searchArray[i - 2];
            System.out.print(searchArray[i] + " ");
        }
        System.out.println();
        System.out.println(searchArray[searchArray.length-1]);

    }
}
