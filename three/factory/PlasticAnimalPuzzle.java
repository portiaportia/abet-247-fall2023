package factory;

import java.util.ArrayList;
import java.util.Arrays;

public class PlasticAnimalPuzzle extends Puzzle 
{
    public PlasticAnimalPuzzle()
    {
        super("Animal Puzzle by Fisher Price", "plastic", new ArrayList<>(Arrays.asList("Fox", "Elephant", "Giraffe", "Owl", "Monkey")));

    }
}