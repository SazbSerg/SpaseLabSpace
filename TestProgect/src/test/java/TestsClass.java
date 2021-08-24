import BinarySearching.BinarySearchingMethod;
import ComparatorPrimer.PowerComparator;
import ComparatorPrimer.SportCar;
import CompareblePrimer.Car;
import EqualsAndHashCode.MethodEquals;
import QuickSortAlgorithm.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestsClass {

    @Test
    public void testMethodEquals(){
        MethodEquals methodEquals = new MethodEquals();
        boolean result = methodEquals.checkMetodEquals("1","1");
        Assert.assertEquals(true, result);

    }


    @Test
    public void testCompareble(){
        Car car1 = new Car("BMW", "black", 24000);
        Car car2 = new Car("Chevrolet", "blue", 10000);
        Car car3 = new Car("Nissan", "yellow", 80000);

        TreeSet<Car> testSet = new TreeSet<>();
        testSet.add(car1);
        testSet.add(car2);
        testSet.add(car3);

        List<Integer> actual = new ArrayList<>();

        for (Car car: testSet){
            actual.add(car.getPrice());
        }
        //System.out.println(testSet);
        // System.out.println(actual);

        List<Integer> expected = new ArrayList<>();
        expected.add(10000);
        expected.add(24000);
        expected.add(80000);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testComparator() {
        SportCar sportCar1 = new SportCar("McLaren", "black", 2500000, 860);
        SportCar sportCar2 = new SportCar("Ferrary", "red", 2700000, 840);
        SportCar sportCar3 = new SportCar("BMW", "white", 2000000, 890);

        ArrayList<SportCar> actual = new ArrayList<>(); // создание тестового экземпляра SportCar
        actual.add(sportCar1);
        actual.add(sportCar2);
        actual.add(sportCar3);

        PowerComparator powerComparator = new PowerComparator();                      // Создание экземпляра Comparator
        actual.sort(powerComparator);                             // сортировка объектов по указанному критерию (power)
        System.out.println(actual);                                                  //проверка правильности сортировки

        ArrayList<String> expected = new ArrayList<>();                      // создание проверочного ArrayList<String>
                                                                              // с названиями марок автомобилей
        expected.add("Ferrary");
        expected.add("McLaren");
        expected.add("BMW");

        ArrayList<String> stringActual = new ArrayList<>();                   // создание ArrayList<String> состоящего
                                                                              // только из названий марок автомобилей
        for (SportCar sportCar: actual){
            stringActual.add(sportCar.getSportCarModel());
        }

        Assert.assertEquals(expected,stringActual);  // проверка
    }

    @Test
    public void BinarySearchingMethodTest(){
        BinarySearchingMethod binarySearchingMethod = new BinarySearchingMethod();
        int actual = binarySearchingMethod.search(new int[]{1,2,3,5,6,7,9}, 7);
        int expected = 5;
        Assert.assertEquals(expected,actual);
        int actual1 = binarySearchingMethod.search(new int[]{1,2,3,5,6,7,9}, 10);
        int expected1 = -1;
        Assert.assertEquals(expected1,actual1);
    }

    @Test
    public void QuickSortTest(){
        QuickSort quickSort = new QuickSort();
        int[] actualArray = {2,4,9,4,2,8,-1,0,10};
        System.out.println(Arrays.toString(actualArray));

        int low = 0;
        int high = actualArray.length - 1;
        quickSort.quickSort(actualArray,low,high);
        System.out.println(Arrays.toString(actualArray));

        int[] expectedArray = {-1, 0, 2, 2, 4, 4, 8, 9, 10};
        String expected = Arrays.toString(expectedArray);

        String actual = Arrays.toString(actualArray);
        Assert.assertEquals(expected,actual);


    }

}