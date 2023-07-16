package strategy;

/**
 *  A representation of having no weapon in a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class WeaponNone implements WeaponBehavior {

  /** 
   * Generates a random number to determine a representation
   * of the attack being performed.
   * @return String String that is the description of the attack being performed.
   */
  @Override
  public String attack() {
    int attack = (int) ((Math.random() * ((2 - 1) + 1)) + 1); // Random number between 1 and 2
    if (attack == 2) {
      return "Oh no! I lost my weapon"; 
    } else {
      return "No one let's me have a weapon";
    }
  }
  
}
