package visitor;

import model.Atividade;
import model.Compensacao;
import model.Emissao;

public interface ReportVisitor {
    void visit(Person person);
    void visit(Company company);
    void visit(Atividade atividade);
    void visit(Emissao emissao);  
    void visit(Compensacao compensacao);

}
