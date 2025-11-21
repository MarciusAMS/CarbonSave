package strategy;

public class EnergyEmissionStrategy implements EmissionStrategy {

    private double kwh;

    public EnergyEmissionStrategy(double kwh) {
        this.kwh = kwh;
    }

    @Override
    public double calcular() {
        return kwh * 0.5; // Exemplo fictício
    }
}
