public class WeaponAxe implements WeaponBehavior {
    public int num;
    public String sent;

    public String attack(){
        num = 1 + (int)(Math.random() * ((2-1) + 1));
        if(num == 1){
             sent = "Swing an axe";
        } else if(num == 2){
            sent = "Twirl with an axe";
        }
        return sent;
    }
}
