public class WeaponKnife implements WeaponBehavior {
    public int num;
    public String sent;

    public String attack(){
        num = 1 + (int)(Math.random() * ((3-1) + 1));
        if(num == 1){
             sent = "Slice with knife";
        } else if(num == 2){
            sent = "Jab with a knife";
        } else if(num == 3){
            sent = "Sneak up on opponent with knife";
        }
        return sent;
    }
}
