package br.com.alura.dao;

public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("O metodo invocado é Designer: ");
        return 200;
    }
}