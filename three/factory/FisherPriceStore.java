package factory;

public class FisherPriceStore extends ToyStore
{
    
    public Puzzle createPuzzle(String type)
    {
            /*
            If the user passes in color it will return a PlasticColorPuzzle,
            If the user passes in animal it will return a PlasticAnimalPuzzle
            Otherwise null
            */
        if(type.equals("color"))
        {
            return new PlasticColorPuzzle();
        }
        else if (type.equals("animal"))
        {
            return new PlasticAnimalPuzzle();
        }
        return null;
        
    }
}
