package br.com.alura.dao;

public class Gerente extends Funcionario implements Autenticavel {

//    private int senha;
        private AutenticaUtil util;

    @Override
    public double getBonificacao() {
        /*Lembrando que o metodo GetBonificacao é da classe pai, por isso, usamos o super para
        * atribuir o valor, ao inves do this. Outro pronto, o @override ( sobrescrita de um método ocorre quando uma classe filha implementa um método que já existe na classe mãe)*/
        return 200;
    }
    public Gerente(){
        AutenticaUtil util = new AutenticaUtil();
            this.util = new AutenticaUtil();
}
    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        boolean response = this.util.autentica(senha);
        return response;
    }
}