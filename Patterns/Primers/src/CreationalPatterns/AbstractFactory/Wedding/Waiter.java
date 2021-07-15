package CreationalPatterns.AbstractFactory.Wedding;

import CreationalPatterns.AbstractFactory.Waitering;

public class Waiter implements Waitering {
    @Override
    public void postOrders() {
        System.out.println("Разносить свадебные блюда");
    }
}
