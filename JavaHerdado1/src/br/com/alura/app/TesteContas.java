package br.com.alura.app;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(300);

        ContaPoupanca cp = new ContaPoupanca();
       // cp.deposita(300, cp);

        System.out.println("Saldo da conta cc: " + cc.getSaldo());
        System.out.println("\n Saldo da conta cp: " + cp.getSaldo());

        cc.transfere(10, cp);
        System.out.println("-------------------");
        System.out.println("Saldo da conta cc: " + cc.getSaldo());
        System.out.println("\n Saldo da conta cp: " + cp.getSaldo());

    }

}