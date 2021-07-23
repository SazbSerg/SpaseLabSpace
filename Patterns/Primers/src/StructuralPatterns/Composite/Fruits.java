package StructuralPatterns.Composite;

public class Fruits implements Basket{
    @Override
    public void put() {
        System.out.println("Привет, я - фрукт!");
    }
}
