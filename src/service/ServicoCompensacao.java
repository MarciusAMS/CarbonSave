package service;

import model.Usuario;
import model.Compensacao;
import strategy.EmissionStrategy;

public class ServicoCompensacao {

    private EmissionStrategy strategy;

    public void setStrategy(EmissionStrategy strategy) {
        this.strategy = strategy;
    }
}
