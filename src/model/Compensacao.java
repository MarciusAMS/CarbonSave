package model;

import visitor.ReportElement;
import visitor.ReportVisitor;

public class Compensacao implements ReportElement {

    private String tipo;
    private double quantidadeCO2;
    private String descricao;

    public Compensacao(String tipo, double quantidadeCO2, String descricao) {
        this.tipo = tipo;
        this.quantidadeCO2 = quantidadeCO2;
        this.descricao = descricao;
    }

    public String getTipo() { return tipo; }
    public double getQuantidadeCO2() { return quantidadeCO2; }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
