package state;

/**
 *  A class that represents an in transit state of a package
 * @author Rhaynie Bongiorno
 * 
 */
public class InTransitState extends State {
    private int days;

    /**
     * Creates an in transit state
     * @param pkg The package
     * @param quantity The amount of packages
     */
    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
    }

    
    /** 
     * A method that gets the status of the package
     * @return A message stating the status of the package
     */
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " out for delivery";
    }

    
    /** 
     * A method that gets the estimated time of arrival for the package
     * @return A message stating the ETA of the package
     */
    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + days + " days";
    }

    
    /** 
     * A method that adds a delay to the package then notifies the user
     * @return A message to the user that the package has been delayed and the new ETA
     */
    public String delay() {
        days += 3;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.\n" + getETA();
    }
}
