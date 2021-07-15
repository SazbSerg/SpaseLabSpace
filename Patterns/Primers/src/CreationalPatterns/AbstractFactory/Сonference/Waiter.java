package CreationalPatterns.AbstractFactory.Сonference;

import CreationalPatterns.AbstractFactory.Waitering;

public class Waiter implements Waitering {
    @Override
    public void postOrders() {
        System.out.println("Разношу заказы на конференции");
    }
}
