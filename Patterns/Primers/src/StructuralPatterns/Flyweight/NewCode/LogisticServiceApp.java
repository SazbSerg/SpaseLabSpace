package StructuralPatterns.Flyweight.NewCode;

import java.util.ArrayList;
import java.util.List;

public class LogisticServiceApp {
    public static void main(String[] args) {
        OrderFactory order = new OrderFactory();
        List<LogisticService> logisticServices = new ArrayList<>();

        logisticServices.add(order.getService("dryCargo"));
        logisticServices.add(order.getService("dryCargo"));
        logisticServices.add(order.getService("liquidCargo"));
        logisticServices.add(order.getService("liquidCargo"));
        System.out.println();

        order.getService("containers").deliver();
        System.out.println();

       for(LogisticService logisticService1 : logisticServices){
           logisticService1.deliver();
           System.out.println(logisticService1.hashCode());
       }

    }
}
