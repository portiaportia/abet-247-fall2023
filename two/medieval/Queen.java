public class Queen extends Character{
    public Queen(String name){
        super(name);
        this.setWeaponBehavior(new WeaponKnife());
    }

    public String toString(){
        return (name + " is a beautiful queen.");
    }
}