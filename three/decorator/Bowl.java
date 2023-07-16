package decorator;
//Written By Guo Han

/**
 * A class of bowl
 * @author Guo Han
 *
 */
public class Bowl extends IceCream{

    /**
     * Create a new Bowl.
     */
    public Bowl(){
        desciption = "Bowl";
    }

    /**
     * Create a string representation the bowl based on desciption.
     * @return A string and it is desciption.
     */
    @Override
    public String toString() {
        return desciption;
    }

    /**
     * Create a function to get cost for this class
     * @return cost of the class and it is 0.
     */
    @Override
    public double getCost() {
        return 0f;
    }
}
