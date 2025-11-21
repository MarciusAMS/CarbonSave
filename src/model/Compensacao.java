package model;

public class Compensacao {

    private String tipo;
    private double quantidadeCO2;

    public Compensacao(String tipo, double quantidadeCO2) {
        this.tipo = tipo;
        this.quantidadeCO2 = quantidadeCO2;
    }

    public String getTipo() { return tipo; }
    public double getQuantidadeCO2() { return quantidadeCO2; }
}
