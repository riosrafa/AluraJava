package br.com.alura.dao;

public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("O metodo invocado é : editor de video: ");
        return 150;
    }
}