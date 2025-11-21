package adapter;

public class ApiExternaGov {
    public double getEmissionFactor(String fuelCode) {
        // Imagine que isso conecta num servidor real
        if (fuelCode.equalsIgnoreCase("GAS_TYPE_A")) {
            return 0.82; // Exemplo de fator
        } else if (fuelCode.equalsIgnoreCase("DSL_TYPE_B")) {
            return 1.15;
        }
        return 0.0;
    }
}

