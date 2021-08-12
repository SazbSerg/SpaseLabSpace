package BehavioralPatterns.State.NewCode;

public class TrafficLightContext {
    private TrafficLightColor state;

    public void setState(TrafficLightColor state) {
        this.state = state;
    }
    public void lightUp(){
        state.lightUp(this);
    }
}
