package state;

/**
 *  A class that represents a package
 * @author Rhaynie Bongiorno
 * 
 */
public class Package {
    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    /**
     * Creates a package
     * @param name The name of the package
     * @param quantity The amount of packages
     */
    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);
    }

    
    /** 
     * A method that set the state of the package to ordered
     * @return Returns a string that contains the status and ETA of the package
     */
    public String order() {
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /** 
     * A method that set the state of the package to in transit
     * @return Returns a string that contains the status and ETA of the package
     */
    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    /** 
     * A method that set the state of the package to delivered
     * @return Returns a string that contains the status and ETA of the package
     */
    public String received() {
        setState(deliveredState);
        return state.getStatus();
    }

    /**
     * A method that accesses the current state's delay message
     * @return The string created by the current state's delay method
     */
    public String delay() {
        return state.delay();
    }

    /**
     * Changes the current state of the package
     * @param state The state that the current state is being changed to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the name of the package
     * @return the name of the package
     */
    public String getName() {
        return name;
    }
}
