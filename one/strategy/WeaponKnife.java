package strategy;

/**
 *  A representation of having a knife in a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class WeaponKnife implements WeaponBehavior {

  /** 
   * Generates a random number to determine a representation
   * of the attack being performed.
   * @return String String that is the description of the attack being performed.
   */
  @Override
  public String attack() {
    int attack = (int) ((Math.random() * ((3 - 1) + 1)) + 1); // Random number between 1 and 3
    switch (attack) {
      case 1:
        return "Slice with knife";
      case 2:
        return "Jab with a knife";
      case 3:
        return "Sneak up on opponent with knife"; 
      default:
        return "INVALID OPERATION";
    }
  }
}
