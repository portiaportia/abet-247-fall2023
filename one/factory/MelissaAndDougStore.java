package factory;
/**
 *  A class for the Melissa And Doug Toy Store
 * @Author Rhaynie Bongiorno
 */
public class MelissaAndDougStore extends ToyStore {
  
  /** 
   * Creates a puzzle based on the type given.
   * @param type The type of puzzle.
   * @return Puzzle The puzzle created.
   */
  public Puzzle createPuzzle(String type) {
    if(type.equals("color")) {
      return new WoodColorPuzzle();
    } else if(type.equals("animal")) {
      return new WoodAnimalPuzzle();
    } else {
      return null;
    }
  }
  
}
