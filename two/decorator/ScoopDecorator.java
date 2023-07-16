package decorator;

abstract class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;
    /**
     * Constructor for ice cream scoops
     * @param iceCream
     * @param numScoops
     */
    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }
    public String toString() {
        String numScoopStr;
        if (numScoops > 1)
            numScoopStr = numScoops + " scoops of ";
        else
            numScoopStr = "a scoop of ";
        return iceCream.toString() + ", " + numScoopStr + flavor + " ice cream";
    }
    public double getCost() {
        System.out.println(this.iceCream.getCost());
        return this.iceCream.getCost() + flavorCost * numScoops;
    }
}
