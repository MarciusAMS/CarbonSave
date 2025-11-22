package strategy;

import model.Usuario;
import model.Compensacao;
import visitor.Person;

public class CompensarComCreditos implements IStrategyCompensacao {

    @Override
    public Compensacao executarCompensacao(Person person) {
        double totalEmissao = person.getEmissaoTotal();

        // LÓGICA: R$ 40,00 por tonelada (1000kg) de CO2
        double precoPorTonelada = 40.0;
        double custo = (totalEmissao / 1000.0) * precoPorTonelada;

        String descricao = String.format("Compra de créditos para neutralizar %.2f kg de CO2.", totalEmissao);

        return new Compensacao("Créditos de Carbono", custo, descricao);
    }
}