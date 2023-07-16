package observer;

/**
 *  A Teacher class that observes the watchman.
 * @author Rhaynie Bongiorno
 * 
 */

public class Teacher implements Observer {
    
  private Subject watchman;

  /**
   * Creates a teacher and adds them to the watchman's Observer list.
   * @param watchman the watchman the teacher is watching.
   */
  public Teacher(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }

  @Override
  /**
   * updates the teacher on the warning type and has them respond.
   * @param warning The warning type.
   */
  public void update(int warning) {
    if (warning == 1) {
      System.out.println("Teacher: Helps get every kid home safe");
    } else if (warning == 2) {
      System.out.println("Teacher: Brings all students to the underground shelter");
    }
  }
}
