package strategy;

/**
 *  A character class for a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public abstract class Character {
  /**
   * Creates a new character with an indicated name.
   * @param name name of the character.
   */
  protected String name;
  protected WeaponBehavior weaponBehavior;

  public Character(String name) {
    this.name = name;
  }

  
  /** 
   * Creates a string representation of the attack being used.
   * @return String
   */
  public String attack() {
    return weaponBehavior.attack();
  }

  
  /** 
   * Applies a new weapon behavior to a character.
   * @param wb selected weapon behavior.
   */
  public void setWeaponBehavior(WeaponBehavior wb) {
    weaponBehavior = wb;
  }

  public abstract String toString();

}
