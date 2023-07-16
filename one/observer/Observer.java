package observer;

/**
 * An interface for an Observer class.
 * @Author Rhaynie Bongiorno
 */
public interface Observer {
  /**
   * updates the observer on the warning type and has them respond.
   * @param warning The warning type.
   */
  public void update(int warning);
}
