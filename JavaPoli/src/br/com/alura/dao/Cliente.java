package br.com.alura.dao;

public class Cliente  implements Autenticavel {

   // private int senha = 222;
    private AutenticaUtil util;
    public Cliente(){
        AutenticaUtil util = new AutenticaUtil();
        this.util = new AutenticaUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        /*Delegamos a chamada do metodo na classe util*/
        boolean response = this.util.autentica(senha);
        return response;
    }
}