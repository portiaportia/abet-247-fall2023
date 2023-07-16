public class WeaponSword implements WeaponBehavior {
    public int num;
    public String sent;

    public String attack(){
        num = 1 + (int)(Math.random() * ((3-1) + 1));
        if(num == 1){
             sent = "Lunge and strike with sword";
        } else if(num == 2){
            sent = "Fancy turn and slice with sword";
        } else if(num == 3){
            sent = "Jam opponents blade with sword";
        }
        return sent;
    }
}
