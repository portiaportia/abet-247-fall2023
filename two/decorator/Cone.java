package decorator;

class Cone extends IceCream {
    private ConeType coneType;
    public Cone(ConeType coneType) {
        this.coneType = coneType;
        String ct = format(coneType);
        this.description = ct;
    }
    private String format(ConeType ct) {
        switch(ct) {
            case SUGAR_CONE:
                return "Sugar Cone";
            case WAFFLE_CONE:
                return "Waffle Cone";
            case PRETZEL_CONE:
                return "Pretzel Cone";
            case CHOCOLATE_DIPPED_CONE:
                return "Chocolate Dipped Cone";
        }
        return "";
    }
    public double getCost() {
        switch(this.coneType) {
            case SUGAR_CONE:
                return 0.75;
            case WAFFLE_CONE:
                return 1.2;
            case PRETZEL_CONE:
                return 1.8;
            case CHOCOLATE_DIPPED_CONE:
                return 1.5;
        }
        return 0;
    }
}