package br.com.alura.dao;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
        System.out.println("Valor da bonificacao: " + this.soma);
    }

    public double getSoma(){
        return soma;
    }
}
