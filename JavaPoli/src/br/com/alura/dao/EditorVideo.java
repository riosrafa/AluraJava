package br.com.alura.dao;

public class EditorVideo extends Funcionario implements Autenticavel {

    private AutenticaUtil util;

    @Override
    public double getBonificacao() {
        System.out.println("O metodo invocado é : editor de video: ");
        return 150;
    }

    public EditorVideo() {
        AutenticaUtil util = new AutenticaUtil();
        this.util = new AutenticaUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }
}