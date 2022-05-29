package br.com.alura.dao;

public class Designer extends Funcionario implements Autenticavel {

    private AutenticaUtil util;

    public Designer() {
        AutenticaUtil util = new AutenticaUtil();
        this.util = new AutenticaUtil();
    }

    @Override
    public double getBonificacao() {
        System.out.println("O metodo invocado é Designer: ");
        return 200;
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