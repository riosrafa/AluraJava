package br.com.alura.app;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void deposita(double valor, Conta c) {
            this.saldo = this.saldo + valor;
            System.out.println("Valor do deposito: " + this.saldo + "Tipo de conta: " + c.toString());
    }

}