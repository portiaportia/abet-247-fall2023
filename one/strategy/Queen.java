package strategy;

/**
 *  A queen class for a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class Queen extends Character {
  /**
   * Creates a new queen with the indicated name.
   * @param name The name of the queen.
   * 
   */
  public Queen(String name) {
    super(name);
    this.weaponBehavior = new WeaponKnife();
  }

  /** 
   * Creates a string describing the queen.
   * @return String String containing the queen's description.
   */
  @Override
  public String toString() {
    return this.name + " is a beautiful queen";
  }
}
