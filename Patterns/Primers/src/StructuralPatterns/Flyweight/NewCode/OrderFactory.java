package StructuralPatterns.Flyweight.NewCode;

import java.util.HashMap;
import java.util.Map;

public class OrderFactory {

    private static final Map<String, LogisticService> services = new HashMap<>();

    public LogisticService getService(String specialization){
        LogisticService logisticService = services.get(specialization);

        if (logisticService == null) {
            switch (specialization){
                case "dryCargo":
                    System.out.println("Воспользуемся услугой перевозки сухогрузов балкером");
                    logisticService = new DryCargo();
                    break;
                case "liquidCargo":
                    System.out.println("Воспользуемся услугой перевозки жидких грузов танкером");
                    logisticService = new LiquidCargo();
                    break;
                case "containers":
                    System.out.println("Воспользуемся услугой перевозки грузов контейнеровозом");
                    logisticService = new Containers();
                    break;
                default:
                    System.out.println("Вы не выбрали услугу");

            }
            services.put(specialization, logisticService);
        }
        return logisticService;
    }
}
