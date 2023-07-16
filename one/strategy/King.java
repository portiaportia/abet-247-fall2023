package strategy;

/**
 *  A king class for a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class King extends Character {
  /**
   * Creates a new King haracter with an indicated name.
   * @param name name of the king.
   */
  public King(String name) {
    super(name);
    this.weaponBehavior = new WeaponSword();
  }

  
  /** 
   * Creates a string describing the king.
   * @return String String containing the king's description.
   */
  @Override
  public String toString() {
    return this.name + " is a Noble King";
  }
}
