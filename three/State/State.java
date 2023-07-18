package State;

public abstract class State {

    protected Package pkg;
    protected int quantity;
    
    public abstract String getStatus();
    public abstract String getETA();
    public abstract String delay();
    
    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    protected String getVerb(String singular, String plural) {
        if (quantity == 1) {
            return singular;
        } else {
            return plural;
        }
    }
}
