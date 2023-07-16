package decorator;
/**
 * A class used to decorate the ice cream with different types
 * @author Rhaynie Bongiorno
 */
public abstract class ScoopDecorator extends IceCream{
  protected IceCream iceCream;
  protected int numScoops;
  protected String flavor;
  protected double flavorCost;

  /**
   * Creates a set of icecream with a set number of scoops
   * @param iceCream The ice cream
   * @param numScoops The number of scoops of ice cream
   */
  public ScoopDecorator(IceCream iceCream, int numScoops) {
    super();
    this.iceCream = iceCream;
    this.numScoops = numScoops;
  }

  /**
   * Creates a string based on the number of scoops of ice cream
   */
  @Override
  public String toString() {
    if(numScoops <= 1) {
      return iceCream.toString() + ", a scoop of " + flavor + " ice cream";
    } else {
      return iceCream.toString() + ", " + numScoops + " scoops of " + flavor + " ice cream";
    }
  }

  /**
   * Adds the flavor cost to the total cost of the ice cream
   */
  @Override
  public double getCost() {
    return flavorCost + iceCream.getCost();
  }
}
