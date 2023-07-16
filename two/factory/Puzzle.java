//Ayush Patel
import java.util.ArrayList;

// creates the abstract puzzle class
public abstract class Puzzle 
{
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

    //prints when box is called
    public String boxPuzzel() 
    {
        System.out.println("putting the ");
		return name;
    }

    //adds all the peices to the string as well as the name and material
    public String assemble() 
    {
        String result = "";
        result += "-------- " + name + " --------\n";
        result += name + "\n";
        result += material + "\n";
        
        for(String piece : pieces) 
        {
            result += piece + "\n";
        }
        
        return result;
	}

    
}
