package state;

/**
 *  A class that represents a state of a package's delivery
 * @author Rhaynie Bongiorno
 * 
 */
public abstract class State {
    protected Package pkg;
    protected int quantity;

    /**
     * Creates an instance of a state
     * @param pkg The package
     * @param quantity The amount of packages
     */
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public abstract String getStatus();

    public abstract String getETA();

    public abstract String delay();

    
    /** 
     * A method that checks whether a singular or plural verb should be used in a message
     * @param singular The singular verb
     * @param plural The plural verb
     * @return The verb needed
     */
    protected String getVerb(String singular, String plural) {
        if(quantity > 1)
            return plural;
        return singular;
    }
}
