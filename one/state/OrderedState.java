package state;

/**
 *  A class that represents an ordered state of a package
 * @author Rhaynie Bongiorno
 * 
 */
public class OrderedState extends State {
    private int days;

    /**
     * Creates an ordered state
     * @param pkg The package
     * @param quantity The amount of packages
     */
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 2;
    }

    
    /** 
     * A method that gets the status of the package
     * @return A message stating the status of the package
     */
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("was", "were") + " ordered";
    }

    
    /** 
     * A method that gets the estimated time of arrival for the package
     * @return A message stating the ETA of the package
     */
    public String getETA() {
        return "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }

    
    /** 
     * A method that adds a delay to the package then notifies the user
     * @return A message to the user that the package has been delayed and the new ETA
     */
    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.\n" + getETA();
    }
}
