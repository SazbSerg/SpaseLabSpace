package PatternsPractice;

public class Realization {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.prime1();
        testClass.prime2();
        testClass.prime3();
        InterInterface interInterface = new TestClass();
        int hc = interInterface.hashCode();
        System.out.println(hc);
        int hc1 = interInterface.hashCode();
        System.out.println(hc1);

    }
}
