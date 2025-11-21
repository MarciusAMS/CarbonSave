package template;

import adapter.IApiAmbiental;
import model.Atividade;

public class CarbonCalculator extends CarbonCalculatorTemplate {

    private IApiAmbiental api;
    private double ultimoFatorCapturado = 0.0;

    public CarbonCalculator(IApiAmbiental api) {
        this.api = api;
    }

    @Override
    protected double calcular(Atividade atividade) {
        // PASSO 1: Descobrimos o fator usando a API
        double fator = this.api.obterFatorEmissao(atividade.getTipo());

        // Guardamos ele na variável da classe para usar no próximo passo
        this.ultimoFatorCapturado = fator;

        // Retornamos APENAS os dados da atividade (ex: 100 km)
        // O Template Method na classe pai fará a multiplicação (base * fator)
        return atividade.getDadosAtividade();
    }

    @Override
    protected double obterFator() {
        // PASSO 2: O template pede o fator, e nós entregamos o que guardamos
        return this.ultimoFatorCapturado;
    }
}
