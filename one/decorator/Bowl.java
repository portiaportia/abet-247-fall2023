package decorator;
/**
 * A class for the bowl for the ice cream.
 * @author Rhaynie Bongiorno
 */
public  class Bowl extends IceCream{
  protected String description;

  /**
   * Creates a bowl and sets the bowl's description.
   */
  public Bowl() {
    super();
    super.description = "bowl";
  }

  /**
   * Gets the cost of the bowl.
   */
  @Override
  public double getCost() {
    return 0;
  }
}
