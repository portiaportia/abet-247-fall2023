package factory;
/**
 * A class for the Fisher Price Toy Store
 * @Author Rhaynie Bongiorno
 */
public class FisherPriceStore extends ToyStore{
  
  /** 
   * Creates a puzzle based on the type given.
   * @param type The type of puzzle.
   * @return Puzzle The puzzle created.
   */
  public Puzzle createPuzzle(String type) {
    if(type.equals("color")) {
      return new PlasticColorPuzzle();
    } else if(type.equals("animal")) {
      return new PlasticAnimalPuzzle();
    } else {
      return null;
    }
  }
}
