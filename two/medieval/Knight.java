public class Knight extends Character {
    public Knight(String name){
        super(name);
        this.setWeaponBehavior(new WeaponBow());

    }

    public String toString(){
        return (name + " is a valiant knight.");
    }
}
