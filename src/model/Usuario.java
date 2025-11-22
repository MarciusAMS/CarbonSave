package model;

public class Usuario {

    private String nome;
    private Emissao ultimaEmissao;
    private double emissaoTotal;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public Emissao getUltimaEmissao() { return ultimaEmissao; }

    public void setUltimaEmissao(Emissao e) {
        this.ultimaEmissao = e;
    }

    public double getEmissaoTotal() {
        return this.emissaoTotal;
    }
}
