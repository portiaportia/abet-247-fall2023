package observer;

/**
 *  A Shop Owner class that observes the watchman.
 * @author Rhaynie Bongiorno
 * 
 */
public class ShopOwner implements Observer {
  
  private Subject watchman;

  /**
   * Creates a shope owner and adds them to the watchman's Observer list.
   * @param watchman the watchman the shop owner is watching.
   */
  public ShopOwner(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }

  @Override
  /**
   * updates the shope owner on the warning type and has them respond.
   * @param warning The warning type.
   */
  public void update(int warning) {
    if (warning == 1) {
      System.out.println("Shop Owner: Close down shop and head home");
    } else if (warning == 2) {
      System.out.println("Shop Owner: Drops everything and find nearest hideout");
    }
  }
}
