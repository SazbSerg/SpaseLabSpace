package BehavioralPatterns.State.NewCode;

public class Green implements TrafficLightColor {
    @Override
    public void lightUp(TrafficLightContext context) {
        System.out.println("Горит зелёный");
        context.setState(new Yellow());
    }
}
