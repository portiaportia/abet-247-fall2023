/**
 * Creat a knight of observer 
 */
public class Knight implements Observer{
    public Knight(){
        super();
    }
/**
 * Create a function to update the Knight's warning status and have the Knight react differently based on the warning
 * Output Knight's response to different warnings
 */
    @Override
    public void update(int warning) {
        if(warning == 1){
            System.out.println("Knight: Helps everyone get home safe");
        }
        if(warning == 2){
            System.out.println("Knight: Prepares for battle");
        }
    }
}