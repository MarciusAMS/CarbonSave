package template;

import adapter.IApiAmbiental;
import model.Atividade;

public class CarbonCalculator extends CarbonCalculatorTemplate {

    private IApiAmbiental api;

    public CarbonCalculator(IApiAmbiental api) {
        this.api = api;
    }

    @Override
    protected double calcular(Atividade atividade) {
        // exemplo: cada atividade tem seu próprio cálculo base
        return atividade.getDadosAtividade();
    }

    @Override
    protected double obterFator() {
        return api.obterFatorEmissao();
    }
}
