package factory;

import java.util.ArrayList;
/**
 *  A class for a puzzle.
 * @Author Rhaynie Bongiorno
 */
public abstract class Puzzle {
  protected String name;
  protected String material;
  protected ArrayList<String> pieces = new ArrayList<String>();

  
  /** 
   * Assembles the puzzle piece by piece.
   * @return String A string representation of assembling the puzzle.
   */
  public String assemble() {
    String puzzResult = "";
    puzzResult += "putting together a " + this.name + ("\n");
    puzzResult += "Adding the following pieces\n";
    for (String pieces : pieces)
      puzzResult += "- " + pieces + ("\n");
      return puzzResult;
  }

  
  /** 
   * Puts the puzzle into a box.
   * @return String A string representation of putting the puzzle into a box.
   */
  public String boxPuzzle() {
    return "putting the " + this.name + " in a box\n";
  }
}
