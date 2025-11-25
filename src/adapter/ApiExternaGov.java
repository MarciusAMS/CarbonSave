package adapter;

public class ApiExternaGov {
    public double getEmissionFactor(String fuelCode) {

        if (fuelCode.equalsIgnoreCase("GAS_TYPE_A")) {
            return 0.82;
        }else if (fuelCode.equalsIgnoreCase("ENERGY_BR")) {
            return 0.5;
        }else if (fuelCode.equalsIgnoreCase("DSL_TYPE_B")) {
            return 1.15;
        }
        return 0.0;
    }
}

