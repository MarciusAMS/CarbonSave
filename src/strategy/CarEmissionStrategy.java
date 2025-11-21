package strategy;

public class CarEmissionStrategy implements EmissionStrategy {

    private double km;

    public CarEmissionStrategy(double km) {
        this.km = km;
    }

    @Override
    public double calcular() {
        return km * 0.12; // Exemplo fictício
    }

}
