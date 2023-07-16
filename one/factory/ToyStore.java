package factory;
/**
 *  A class for a Toy Store.
 * @Author Rhaynie Bongiorno
 */
public abstract class ToyStore {
  
  /** 
   * Orders a puzzles by the type specified.
   * @param type The type of puzzle.
   * @return String The string representation of ordering a puzzle.
   */
  public String orderPuzzle(String type) {
    Puzzle puzzle = createPuzzle(type);
    
    String orderedPuzzle = "";
    orderedPuzzle += puzzle.assemble();
   orderedPuzzle += puzzle.boxPuzzle();

    return orderedPuzzle;
    
  }
  /** 
   * Creates a puzzle based on the type given.
   * @param type The type of puzzle.
   * @return Puzzle The puzzle created.
   */
  public abstract Puzzle createPuzzle(String type);
}
