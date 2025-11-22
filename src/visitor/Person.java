package visitor;

public class Person implements ReportElement {

    private String nome;
    private double emissao;

    public Person(String nome, double emissao) {
        this.nome = nome;
        this.emissao = emissao;
    }

    public double getEmissaoTotal() {
        return this.emissao;
    }

    public String getNome() { return nome; }
    public double getEmissao() { return emissao; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}

