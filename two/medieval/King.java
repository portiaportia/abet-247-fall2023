public class King extends Character {
    public King(String name){
        super(name);
        this.setWeaponBehavior(new WeaponSword());
    }

    public String toString(){
        return (name + " is a Noble King.");
    }
}
