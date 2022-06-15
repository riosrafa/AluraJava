package br.com.alura.app;

import br.com.alura.model.CalculadorImpostoTransacoes;
import br.com.alura.model.SeguroSaude;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        cc1.deposita(300);

        SeguroSaude ss = new SeguroSaude();
        ss.getValorImposto();

        CalculadorImpostoTransacoes cit = new CalculadorImpostoTransacoes();
        //validando o metodo, e passando um obj
        cit.registro(ss);
        //cit.getImpostoTotal();

        //passando o obj
        cit.registro(cc1);
        //cit.getImpostoTotal();

        ContaPoupanca cp = new ContaPoupanca();
       // cp.deposita(300, cp);

        System.out.println("Saldo, após o imposto: " + cit.getImpostoTotal());

    }

}