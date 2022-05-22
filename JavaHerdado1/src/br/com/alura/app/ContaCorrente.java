package br.com.alura.app;

import br.com.alura.model.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
    }

    public ContaCorrente(int agencia, int numero) {
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

    @Override
    public boolean saca(double valor) {
        double valorJuros = valor + 0.10;
        return super.saca(valorJuros);
    }
}