package visitor;


import model.Atividade;
import model.Emissao;

public class PdfReportVisitor implements ReportVisitor {

    @Override
    public void visit(Person person) {
        System.out.println("---- PDF: Relatório Pessoa ----");
        System.out.println("Nome: " + person.getNome());
        System.out.println("Emissão Total: " + person.getEmissao() + " kg CO2eq");
        System.out.println("--------------------------------");
    }

    @Override
    public void visit(Company company) {
        System.out.println("---- PDF: Relatório Empresa ----");
        System.out.println("Empresa: " + company.getNome());
        System.out.println("Emissão Total: " + company.getEmissao() + " kg CO2eq");
        System.out.println("---------------------------------");
    }

    @Override
    public void visit(Atividade atividade) {
        System.out.println("---- PDF: Relatório Atividade ----");
        System.out.println("ID: " + atividade.getId());
        System.out.println("Tipo: " + atividade.getTipo());
        System.out.println("Dados da Atividade: " + atividade.getDadosAtividade());
        System.out.println("-----------------------------------");
    }

    @Override
    public void visit(Emissao emissao) {
        System.out.println("---- PDF: Relatório Emissão ----");
        System.out.println("Quantidade CO2: " + emissao.getQuantidadeCO2());
        System.out.println("Fator Utilizado: " + emissao.getFatorUtilizado());
        System.out.println("--------------------------------");
    }
}
