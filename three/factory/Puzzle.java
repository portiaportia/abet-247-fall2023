package factory;

import java.util.ArrayList;

public abstract class Puzzle 
{
    protected String name;
    protected String material;
    protected ArrayList<String> pieces;
    
    public Puzzle(String name, String material, ArrayList<String>pieces)
    {
        this.name = name;
        this.material = material;
        this.pieces = pieces;
    }
    

    
    public String assemble()
    {
        return "Putting together a "
                + name + "\n" +
                "This puzzle is made out of "
                + material + "\n" +
                "Adding the following pieces\n"
                + pieces;
                
    }

    public String boxPuzzle()
    {
        return "Putting the " + name + " in a box";
    }
}