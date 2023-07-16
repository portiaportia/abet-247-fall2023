//Ayush Patel
public abstract class ToyStore 
{
    public abstract Puzzle createPuzzle(String type);
	
	public Puzzle orderPuzzle(String type) {
		Puzzle puzzle = createPuzzle(type);
		
		puzzle.boxPuzzel();
		puzzle.assemble();
		
		return puzzle;
	}
}
