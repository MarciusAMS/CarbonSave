package model;

import visitor.ReportVisitor;
import visitor.ReportElement;

public class Emissao implements ReportElement {

    private double quantidadeCO2;
    private double fatorUtilizado;

    public Emissao(double quantidadeCO2, double fatorUtilizado) {
        this.quantidadeCO2 = quantidadeCO2;
        this.fatorUtilizado = fatorUtilizado;
    }

    public double getQuantidadeCO2() { return quantidadeCO2; }
    public double getFatorUtilizado() { return fatorUtilizado; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
