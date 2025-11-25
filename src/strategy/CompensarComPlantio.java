package strategy;

import model.Usuario;
import model.Compensacao;
import visitor.Person;

public class CompensarComPlantio implements IStrategyCompensacao {

    @Override
    public Compensacao executarCompensacao(Person person) {
        double totalEmissao = person.getEmissaoTotal();

        int qtdArvores = (int) (totalEmissao / 50);

        if (qtdArvores < 1) qtdArvores = 1;

        String descricao = "Plantio de " + qtdArvores + " árvores nativas.";

        return new Compensacao("Plantio", (double) qtdArvores, descricao);
    }
}