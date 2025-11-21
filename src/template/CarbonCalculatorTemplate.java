package template;

import model.Atividade;
import model.Emissao;

public abstract class CarbonCalculatorTemplate {

    // MÉTODO TEMPLATE
    public final Emissao processarEmissao(Atividade atividade) {
        double base = calcular(atividade);
        double fator = obterFator();
        return new Emissao(base * fator, fator);
    }

    // PASSO 1 — cálculo base conforme o tipo de atividade
    protected abstract double calcular(Atividade atividade);

    // PASSO 2 — obtém fator (pode vir de API externa via Adapter)
    protected abstract double obterFator();
}
