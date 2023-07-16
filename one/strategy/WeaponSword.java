package strategy;

/**
 *  A representation of having a sword in a Medieval battle.
 * @author Rhaynie Bongiorno
 * 
 */
public class WeaponSword implements WeaponBehavior {

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
        return "Lunge and strike with sword";
      case 2:
        return "Fancy turn and slice with sword";
      case 3:
        return "Jam opponents blade with sword";
      default:
        return "INVALID OPERATION";
    }
  }
}
