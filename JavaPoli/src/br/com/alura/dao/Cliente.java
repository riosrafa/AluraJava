package br.com.alura.dao;

public class Cliente  implements Auntenticavel {

    private int senha = 222;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean auntentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else {
            return false;
        }
    }
}