package br.com.alura.model;

public class CalculadorImpostoTransacoes {

    private double impostoTotal;
    public void registro(Tributavel t){
        double valorImposto = t.getValorImposto();
        this.impostoTotal += valorImposto;
    }

    public double getImpostoTotal() {
        return impostoTotal;
    }
}
