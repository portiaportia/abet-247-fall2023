package strategy;

/**
 *  A troll class for a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class Troll extends Character {
  /**
   * Creates a new troll with the indicated name.
   * @param name The name of the troll.
   * 
   */
  public Troll(String name) {
    super(name);
    this.weaponBehavior = new WeaponAxe();
  }

  /** 
   * Creates a string describing the troll.
   * @return String String containing the troll's description.
   */
  @Override
  public String toString() {
    return this.name + " is a funny troll";
  }
}
