package decorator;
//Written By Guo Han

/**
 * chocolate in flavor
 * @author Guo Han
 *
 */
public class Chocolate extends ScoopDecorator {

    /**
     * Create a new chocolate with an entity of IceCream and a number to get its scoops.
     * @param iceCream an entity of IceCream
     * @param numScoops a number to get its scoops
     */
    public Chocolate(IceCream iceCream, int numScoops){
        super(iceCream, numScoops);
        this.iceCream = iceCream;
        this.numScoops = numScoops;
        this.flavor = "chocolate";
        this.flavorCost = 1.5;
    }
}