package decorator;
//Written By Guo Han

/**
 * cone in IceCream
 * @author Guo Han
 *
 */
public class Cone extends IceCream{
    private ConeType coneType;

    /**
     * Create a new cone with a ConeType.
     * @param coneType1 an enum about the cone type.
     *
     */
    public Cone(ConeType coneType1){
        coneType = coneType1;
        String temp = coneType.name().toLowerCase();
        String temp1 = "";
        int mark = 0;
        for(int i = 0;i<temp.length();i++){
            if(temp.charAt(i) == '_'){
                temp1 += temp.substring(mark, i)+" ";
                mark = i+1;
            }
        }
        temp1 += temp.substring(mark);
        desciption = temp.substring(0, 1).toUpperCase()+temp1.substring(1);
    }

    /**
     * Create a string representation the Cone based on desciption.
     * @return A string and it is desciption.
     */
    @Override
    public String toString() {
        return desciption;
    }

    /**
     * Create a function to get cost for this class
     * @return cost of the class.
     */
    @Override
    public double getCost() {
        double re = 0f;
        if(coneType == ConeType.SUGAR_CONE){
            re = 0.75;
        } else if (coneType == ConeType.PRETZEL_CONE) {
            re = 1.8;
        } else if (coneType == ConeType.WAFFLE_CONE) {
            re = 1.2;
        }else{
            re = 1.5;
        }
        return re;
    }
}
