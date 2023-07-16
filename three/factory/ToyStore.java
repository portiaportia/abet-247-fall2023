package factory;

public abstract class ToyStore
{
    public abstract Puzzle createPuzzle(String type);

    public String orderPuzzle(String type)
    {
        Puzzle puzzle = createPuzzle(type);

        String assembled = puzzle.assemble();
		String boxed = puzzle.boxPuzzle();
		
		return assembled + "\n" + boxed;
    }
}