package strategy;

import model.Compensacao;
import visitor.Person;

public interface IStrategyCompensacao {
    Compensacao executarCompensacao(Person person);
}
