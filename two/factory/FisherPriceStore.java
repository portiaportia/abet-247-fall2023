//Ayush Patel
public class FisherPriceStore extends ToyStore {

    //creates fisher pricce store
	public Puzzle createPuzzle(String puzzleType) 
    {
		if(puzzleType.equals("PlasticColorPuzzle")) 
        {
			return new PlasticColorPuzzle();
		}else if(puzzleType.equals("PlasticAnimalPuzzle")) 
        {
			return new PlasticAnimalPuzzle();
        }
		
		return null;
	}
	
}