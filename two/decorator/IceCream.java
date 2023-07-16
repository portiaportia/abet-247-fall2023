package decorator;

abstract class IceCream {
    protected String description;
    /**
     * Converts IceCream to String
     * @return string representation of IceCream object
     * @author Jonas Kovacs
     */
    public String toString() {
        return this.description;
    }
    /**
     * returns the cost of the IceCream Object
     * @return double Cost
     * @author Jonas Kovacs
     */
    public abstract double getCost();
}