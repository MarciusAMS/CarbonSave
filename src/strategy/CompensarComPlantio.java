package strategy;

import model.Usuario;
import model.Compensacao;
import visitor.Person;

public class CompensarComPlantio implements IStrategyCompensacao {

    @Override
    public Compensacao executarCompensacao(Person person) {
        double totalEmissao = person.getEmissaoTotal(); // Pegamos o total emitido

        // LÓGICA: 1 árvore para cada 50kg de CO2 (exemplo)
        int qtdArvores = (int) (totalEmissao / 50);

        if (qtdArvores < 1) qtdArvores = 1; // Mínimo de 1 árvore

        String descricao = "Plantio de " + qtdArvores + " árvores nativas.";

        // Retorna o objeto Compensacao preenchido
        // Supondo construtor: Compensacao(tipo, valor, descricao)
        return new Compensacao("Plantio", (double) qtdArvores, descricao);
    }
}