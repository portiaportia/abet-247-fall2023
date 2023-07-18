package State;

public class OrderedState extends State {
    private int days;
    
    public OrderedState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 2;
    }
    
    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("was" , "were") + " ordered";
    }

    public String getETA() {
        return "The " + pkg.getName() + " will be shipped in " + days + " business days";
    }

    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing\n"
                + "The " + pkg.getName() + " will be shipped within " + days + " business days";
    }

}
