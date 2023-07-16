package state;

/**
 *  A class that represents a delievered state of a package
 * @author Rhaynie Bongiorno
 * 
 */
public class DeliveredState extends State {

    /**
     * Creates a delievered state
     * @param pkg The package
     * @param quantity The amount of packages
     */
    public DeliveredState(Package pkg, int quantity) {
        super(pkg, quantity);
    }

    
    /** 
     * A method that gets the status of the package
     * @return A message stating the status of the package
     */
    public String getStatus() {
        return "The " + pkg.getName() +  " " + getVerb("is", "are") + " here for you";
    }

    
    /** 
     * A method that gets the estimated time of arrival for the package
     * @return A message stating the ETA of the package
     */
    public String getETA() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here";
    }

    
    /** 
     * A method that notifies the user that their package
     * has not been delayed because it's been delievered
     * @return The message to the user 
     */
    public String delay() {
        return "The " + pkg.getName() + getVerb("has", "have") + " already been delivered";
    }
}
