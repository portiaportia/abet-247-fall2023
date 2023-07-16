/** 
 * Creat a ShopOwner of observer 
*/
public class Teacher implements Observer{
    public Teacher(){
        super();
    }
/**
 * Create a function to update the Teacher's warning status and have the Knight react differently based on the warning
 * Output Teacher's response to different warnings
 */
    @Override
    public void update(int warning) {
        if(warning == 1){
            System.out.println("Teacher: Helps get every kid home safe");
        }
        if(warning == 2){
            System.out.println("Teacher: Brings all students to the underground shelter");
        }
    }
}