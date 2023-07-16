//Ayush Patel
public class MelissaAndDogStore extends ToyStore
{
    //creates melissa and dog store
    public Puzzle createPuzzle(String puzzleType) 
    {
		if(puzzleType.equals("WoodColorPuzzle")) 
        {
			return new WoodColorPuzzle();
		}else if(puzzleType.equals("WoodAnimalPuzzle")) 
        {
			return new WoodAnimalPuzzle();
        }
		
		return null;
	}
}
