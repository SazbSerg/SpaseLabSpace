package BehavioralPatterns.State.NewCode;

public class Red implements TrafficLightColor{
    @Override
    public void lightUp(TrafficLightContext context) {
        System.out.println("Горит красный");
        context.setState(new Green());
    }
}
