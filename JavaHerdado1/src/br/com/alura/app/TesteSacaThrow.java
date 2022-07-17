package br.com.alura.app;

public class TesteSacaThrow {
    public static void main(String[] args) {
        Conta c = new ContaCorrente(123, 321);

        c.saca(100);
        System.out.println(c.getSaldo());
    }
}
