package model;

import visitor.ReportElement;
import visitor.ReportVisitor;

public class Atividade implements ReportElement {

    private int id;
    private String tipo;
    private double dadosAtividade;

    public Atividade(int id, String tipo, double dadosAtividade) {
        this.id = id;
        this.tipo = tipo;
        this.dadosAtividade = dadosAtividade;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getDadosAtividade() {
        return dadosAtividade;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
