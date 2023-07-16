package observer;

/**
 *  A Knight class that observes the watchman.
 * @author Rhaynie Bongiorno
 * 
 */

public class Knight implements Observer {
    
  private Subject watchman;

  /**
   * Creates a knight and adds them to the watchman's Observer list.
   * @param watchman the watchman the knight is watching.
   */
  public Knight(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }

  @Override
  /**
   * updates the knight on the warning type and has them respond.
   * @param warning The warning type.
   */
  public void update(int warning) {
    if (warning == 1) {
      System.out.println("Knight: Helps everyone get home safe");
    } else if (warning == 2) {
      System.out.println("Knight: Prepares for battle");
    }
  }
}
