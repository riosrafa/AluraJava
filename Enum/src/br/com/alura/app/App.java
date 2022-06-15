package br.com.alura.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Valor Passado na thread: " + Thread.MAX_PRIORITY);

        Thread t = new Thread(() -> System.out.println("Roda roda jequiti: "));

        t.setPriority(Thread.MAX_PRIORITY);

        t.start();
    }
}
