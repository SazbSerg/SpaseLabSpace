package CreationalPatterns.Builder.Practice2;

public class RunnerBuilder {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .frameBuilder("Сварной каркас")
                .wheelsBuilder("Четыре колеса")
                .engineBuilder("экономный двигатель")
                .transmissionBuilder("износостойкая трансмиссия")
                .build();
        System.out.println(car);
    }
}
