package StructuralPatterns.Composite;

public class Water implements Basket{
    @Override
    public void put() {
        System.out.println("Привет, я - водичка!");
    }
}
