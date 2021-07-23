package StructuralPatterns.Composite;

public class Meat implements Basket{
    @Override
    public void put() {
        System.out.println("Привет, я - мясо!");
    }
}
