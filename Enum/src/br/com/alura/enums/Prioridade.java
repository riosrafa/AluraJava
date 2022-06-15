package br.com.alura.enums;

public enum Prioridade {

    /* Lembrando que no enum, devemos por boas praticas escrever em maisculo as variaveis */

    MIN(1),NORMAL(5), MAX(10);

    private int valor;
    private Prioridade(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
