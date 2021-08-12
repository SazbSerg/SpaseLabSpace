package BehavioralPatterns.State.NewCode;

public class Yellow implements TrafficLightColor {
    @Override
    public void lightUp(TrafficLightContext context) {
        System.out.println("Горит жёлтый");
        context.setState(new Red());
    }
}
