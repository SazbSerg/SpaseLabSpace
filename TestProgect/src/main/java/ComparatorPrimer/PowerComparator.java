package ComparatorPrimer;

import java.util.Comparator;

public class PowerComparator implements Comparator<SportCar> {
    @Override
    public int compare(SportCar sportCar1, SportCar sportCar2) {
        if (sportCar1.getPower() == sportCar2.getPower()) {
            return 0;
        } else if (sportCar1.getPower() > sportCar2.getPower()) {
            return 1;
        } else {
            return -1;
        }
    }
}