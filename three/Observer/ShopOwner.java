/**
 * Creat a ShopOwner of observer 
 */
public class ShopOwner implements Observer{
    public ShopOwner(){
        super();
    }

/**
 * Create a function to update the ShopOwner's warning status and have the Knight react differently based on the warning
 * Output Knight's response to different warnings
 */
    public void update(int warning){
        if(warning == 1){
            System.out.println("Shop Owner: Close down shop and head home");
        }
        if(warning == 2){
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
        }
    }
}