package br.com.alura.app;

import br.com.alura.oo.ByteBank;

public class TesteReferencia {
    public static void main(String[] args) {
        ByteBank conta = new ByteBank();
        conta.setSaldo(300.0);

        System.out.println("Valor do saldo: " + conta.getSaldo());

    //passagem por referencia( n passa um new, n cria um novo objeto)
        ByteBank bb = conta;

        System.out.println(conta);
        System.out.println(bb);
    }
}
