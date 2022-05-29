package br.com.alura.dao;

public class Fiscal implements Autenticavel {

    private int senha = 777;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else {
            return false;
        }
    }
}