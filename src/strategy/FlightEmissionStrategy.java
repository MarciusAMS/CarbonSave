package strategy;

import model.Compensacao;
import model.Usuario;

public class FlightEmissionStrategy implements EmissionStrategy {

    private double distanciaKm;

    public FlightEmissionStrategy(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    @Override
    public double calcular() {
        return distanciaKm * 0.2;
    }
}

