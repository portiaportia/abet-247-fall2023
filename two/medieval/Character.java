public abstract class Character implements WeaponBehavior{
    protected String name;
    protected WeaponBehavior wb;
    protected String attack;
    public int num;
    public String sent;

    public Character(String name){
        this.name = name;
    }

    public abstract String toString();

    public void setWeaponBehavior(WeaponBehavior wb){
      this.wb = wb;
    }
    
    public String attack(){
       return wb.attack();
    }
}


