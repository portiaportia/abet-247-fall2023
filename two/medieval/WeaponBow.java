public class WeaponBow implements WeaponBehavior {
    public int num;
    public String sent;

    public String attack(){
        num = 1 + (int)(Math.random() * ((2-1) + 1));
        if(num == 1){
             sent = "Draw and loose an arrow";
        } else if(num == 2){
            sent = "Shoot arrow high in the sky";
        }
        return sent;
    }
}
