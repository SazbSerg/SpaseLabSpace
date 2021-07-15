package CreationalPatterns.Prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Car car = new Car("Red", 200, "electro");
        System.out.println(car);
        Object copyCar = car.copy();
        System.out.println(copyCar);

        //Nissan nissan = new Nissan("green", 150, "oil");
        //System.out.println(nissan);
        //Nissan copyNissan = (Nissan) nissan.copy();
       // System.out.println(copyNissan);

       // System.out.println(copyNissan.getColor());

    }
}
