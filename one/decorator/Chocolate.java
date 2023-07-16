package decorator;
/**
 * A class for the chocolate flavor of ice cream.
 * @author Rhaynie Bongiorno
 */
public class Chocolate extends ScoopDecorator{
  
  /**
   * Creates a number of scoops of chocolate ice cream and sets the cost 
   * based on the number of scoops.
   * @param iceCream the ice cream.
   * @param numScoops the number of scoops of ice cream.
   */
  public Chocolate(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    flavor = "chocolate";
    flavorCost = 1.5 * numScoops;
  }
}
