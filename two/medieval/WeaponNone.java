public class WeaponNone implements WeaponBehavior {
    public int num;
    public String sent;

    public String attack(){
        num = 1 + (int)(Math.random() * ((2-1) + 1));
        if(num == 1){
             sent = "Oh no! I lost my weapon";
        } else if(num == 2){
            sent = "No one let's me have a weapon";
        }
        return sent;
    }
}
