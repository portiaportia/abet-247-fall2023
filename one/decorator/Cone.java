package decorator;
/**
 * A class for the cone of the ice cream.
 * @author Rhaynie Bongiorno
 */
public class Cone extends IceCream {
  private ConeType coneType;

 /**
 * Creates a cone and gives it a description
 * based on the cone type.
 * @param coneType The type of cone.
 */
public Cone(ConeType coneType) {
    this.coneType = coneType;
    switch(coneType) {
      case SUGAR_CONE:
        description = "sugar cone";
        break;
      case WAFFLE_CONE:
        description = "waffle cone";
        break;
      case PRETZEL_CONE:
        description = "pretzel cone";
        break;
      case CHOCOLATE_DIPPED_CONE:
        description = "chocolate dipped cone";
        break;
      default:
        break;
    }
  }

  /**
   * Gets the cost of the cone based on the cone type
   */
  @Override
  public double getCost() {
    switch(coneType) {
      case SUGAR_CONE:
        return 0.75;
      case WAFFLE_CONE:
        return 1.20;
      case PRETZEL_CONE:
        return 1.80;
      case CHOCOLATE_DIPPED_CONE:
        return 1.50;
      default:
        return 0;
    }
  }
}
