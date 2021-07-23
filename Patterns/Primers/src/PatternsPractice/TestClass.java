package PatternsPractice;

public class TestClass extends AbstractClass{
    @Override
    void aVoid() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void prime1() {
        super.prime1();
    }
    @Override
    public void prime2() {
        System.out.println("2 метод в тестовом классе");
    }

    @Override
    public void prime3() {
        System.out.println("3 метод в тестовом классе");
    }
}
