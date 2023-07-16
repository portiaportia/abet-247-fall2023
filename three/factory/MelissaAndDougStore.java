package factory;

public class MelissaAndDougStore extends ToyStore
{
    
    public Puzzle createPuzzle(String type)
    {
            /*
            If the user passes in color it will return a WoodColorPuzzle,
            If the user passes in animal it will return a WoodAnimalPuzzle
            Otherwise null
            */
        if(type.equals("color"))
        {
            return new WoodColorPuzzle();
        }
        else if (type.equals("animal"))
        {
            return new WoodAnimalPuzzle();
        }
        return null;
        
    }
}
