package visitor;


import model.Atividade;
import model.Emissao;

public class HtmlReportVisitor implements ReportVisitor {

    @Override
    public void visit(Person person) {
        System.out.println("<html>");
        System.out.println("<head><title>Relatório - Pessoa</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Relatório de Emissões (Pessoa)</h1>");
        System.out.println("<p><strong>Nome:</strong> " + person.getNome() + "</p>");
        System.out.println("<p><strong>Emissão Total:</strong> " + person.getEmissao() + " kg CO2eq</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }

    @Override
    public void visit(Company company) {
        System.out.println("<html>");
        System.out.println("<head><title>Relatório - Empresa</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Relatório de Emissões (Empresa)</h1>");
        System.out.println("<p><strong>Empresa:</strong> " + company.getNome() + "</p>");
        System.out.println("<p><strong>Emissão Total:</strong> " + company.getEmissao() + " kg CO2eq</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }

    @Override
    public void visit(Atividade atividade) {
        System.out.println("<html>");
        System.out.println("<head><title>Relatório - Atividade</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Relatório de Emissões (Atividade)</h1>");
        System.out.println("<p><strong>ID:</strong> " + atividade.getId() + "</p>");
        System.out.println("<p><strong>Tipo:</strong> " + atividade.getTipo() + "</p>");
        System.out.println("<p><strong>Dados:</strong> " + atividade.getDadosAtividade() + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }

    @Override
    public void visit(Emissao emissao) {
        System.out.println("<html>");
        System.out.println("<head><title>Relatório - Emissão</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Relatório de Emissão</h1>");
        System.out.println("<p><strong>Quantidade CO2:</strong> " + emissao.getQuantidadeCO2() + "</p>");
        System.out.println("<p><strong>Fator utilizado:</strong> " + emissao.getFatorUtilizado() + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
