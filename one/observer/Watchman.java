package observer;

import java.util.ArrayList;

/**
 *  A watchman class that warns the townspeople.
 * @author Rhaynie Bongiorno
 * 
 */
public class Watchman implements Subject {

  private ArrayList<Observer> observers;
  private int warning;

  /**
   * Creates a new watchman with an ArrayList of Observers.
   */
  public Watchman() {
    observers = new ArrayList<Observer>();
  }

  @Override
  /**
   * Adds an Observer from the Observer ArrayList.
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  /**
   * Removes an Observer from the Observer ArrayList.
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  /**
   * Notifies each observer in the Observer ArrayList.
   */
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(warning);
    }
  }

  /**
  * Issues a warning based on the warning type.
  * @param warning The warning type.
  */
  public void issueWarning(int warning) {
    this.warning = warning;
    if (warning == 1) {
      System.out.println("WARNING:  1 trumpet was played!");
    } else if (warning == 2) {
      System.out.println("WARNING:  2 trumpets were played!");
    }
    notifyObservers();
  }
}
