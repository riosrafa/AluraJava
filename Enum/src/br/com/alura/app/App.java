package br.com.alura.app;

import br.com.alura.enums.Prioridade;

public class App {
    public static void main(String[] args) {
        /*Lembrando que a variavel, podemos navegar no objeto atráves do (.) */
        Prioridade pMin = Prioridade.MIN;
        Prioridade pNormal = Prioridade.NORMAL;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pMin.getValor());

    }
}
