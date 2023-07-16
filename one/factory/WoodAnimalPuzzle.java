package factory;
/**
 *  A class for a Wooden Animal Puzzle
 * @Author Rhaynie Bongiorno
 */
public class WoodAnimalPuzzle extends Puzzle {
  public WoodAnimalPuzzle() {
    name = "Animal Puzzle by Melissa and Doug";
    material = "wood";
    pieces.add("Horse");
    pieces.add("Sheep");
    pieces.add("Dog");
    pieces.add("Cat");
    pieces.add("Cow");
    pieces.add("Chicken");
  }
  
}
