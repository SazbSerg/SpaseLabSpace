package StructuralPatterns.Adapter.Inheritance.Practice;

public class TestAdapter implements SomeMethod{
    SomeOldMethod someOldMethod = new SomeOldMethod();
    @Override
    public void test() {
        someOldMethod.test2();
    }
}
