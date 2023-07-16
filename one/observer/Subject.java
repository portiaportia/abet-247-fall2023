package observer;

/**
 * An interface for an Observer class.
 * @Author Rhaynie Bongiorno
 */

public interface Subject {

  /**
   * Adds an Observer from the Observer ArrayList.
   */
  public void registerObserver(Observer observer);

  /**
   * Removes an Observer from the Observer ArrayList.
   */
  public void removeObserver(Observer observer);

  /**
   * Notifies each observer in the Observer ArrayList.
   */
  public void notifyObservers();

}
