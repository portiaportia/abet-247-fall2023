package decorator;
/**
 * A class for the vanilla flavor of ice cream.
 * @author Rhaynie Bongiorno
 */
public class Vanilla extends ScoopDecorator{
  
  /**
   * Creates a number of scoops of vanilla ice cream and sets the cost 
   * based on the number of scoops.
   * @param iceCream the ice cream.
   * @param numScoops the number of scoops of ice cream.
   */
  public Vanilla(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    flavor = "vanilla";
    flavorCost = 1.25 * numScoops;
  }
}
