package strategy;

/**
 *  A knight class for a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class Knight extends Character {
  /**
   * Creates a new knight with the indicated name.
   * @param name The name of the knight.
   * 
   */
  public Knight(String name) {
    super(name);
    this.weaponBehavior = new WeaponBow();
  }

  
  /** 
   * Creates a string describing the knight.
   * @return String String containing the knight's description.
   */
  @Override
  public String toString() {
    return this.name + " is a valiant knight";
  }
}
