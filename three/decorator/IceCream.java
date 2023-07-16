package decorator;
//Written By Guo Han

/**
 * An abstract of IceCream
 * @author Guo Han
 *
 */
public abstract class IceCream {
    public String desciption;

    /**
     * Create a string representation the IceCream based on desciption.
     * @return A string and it is desciption.
     */
    public String toString() {
        return desciption;
    }

    /**
     * Create a function to get cost for this class
     * @return cost of the class and it is 0.
     */
    public double getCost(){
        return 0f;
    }
}
