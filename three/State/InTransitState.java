package State;

public class InTransitState extends State {
    private int days;

    public InTransitState(Package pkg, int quantity) {
        super(pkg, quantity);
        days = 5;
    }

    public String getStatus() {
        return "The " + pkg.getName() + getVerb(" is", " are") + " out for delivery"; 
    }

    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + days + " days";
    }

    public String delay() {
        days += 3;
        return "The " + pkg.getName() + getVerb(" has", " have") + " experienced a delay in shipping\n"
                + "The " + pkg.getName() + " should arrive within " + days + " days";
    }

}
