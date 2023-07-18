package State;

public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);

    }

    public String order() {
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public String received() {
        setState(deliveredState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public String delay() {
        return state.delay();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }


}
