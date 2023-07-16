package decorator;
/**
 * A class for the Ice Cream.
 * @author Rhaynie Bongiorno
 */
public abstract class IceCream {
  protected String description;

  /**
   * Turns the description of the ice cream to a string.
   */
  @Override
  public String toString() {
    return description;
  }

  /**
   * Gets the cost of the ice cream.
   */
  public abstract double getCost();
}
