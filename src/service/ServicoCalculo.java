package service;

import model.Atividade;
import model.Emissao;
import template.CarbonCalculatorTemplate;

public class ServicoCalculo {

    private CarbonCalculatorTemplate calculadora;

    public ServicoCalculo(CarbonCalculatorTemplate calculadora) {
        this.calculadora = calculadora;
    }

    public Emissao gerarEmissao(Atividade atividade) {
        return calculadora.processarEmissao(atividade);
    }
}
