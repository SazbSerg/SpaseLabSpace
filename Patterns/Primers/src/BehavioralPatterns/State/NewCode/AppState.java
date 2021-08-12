package BehavioralPatterns.State.NewCode;

public class AppState {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();
        trafficLightContext.setState(new Red());
        trafficLightContext.lightUp();
        trafficLightContext.lightUp();
        trafficLightContext.lightUp();
        trafficLightContext.lightUp();
        trafficLightContext.lightUp();
        trafficLightContext.lightUp();
        trafficLightContext.lightUp();
    }
}
