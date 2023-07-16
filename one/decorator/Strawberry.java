package decorator;
/**
 * A class for the strawberry ice cream flavor.
 * @author Rhaynie Bongiorno
 */
public class Strawberry extends ScoopDecorator{
  
  /**
   * Creates a number of scoops of strawberry ice cream and sets the cost 
   * based on the number of scoops.
   * @param iceCream the ice cream.
   * @param numScoops the number of scoops of ice cream.
   */
  public Strawberry(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    flavor = "strawberry";
    flavorCost = 1.4 * numScoops;
  }
}
