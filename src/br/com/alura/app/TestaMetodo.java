package br.com.alura.app;

import br.com.alura.oo.ByteBank;

public class TestaMetodo {
    public static void main(String[] args) {
        ByteBank conta = new ByteBank();

        conta.deposita(200);
        conta.saca(50);
        conta.saca(1500);
        System.out.println("Chamando metodo: " + conta.getSaldo());
        System.out.println("Chamando metodo: " + conta.getSaldo());
    }
}
