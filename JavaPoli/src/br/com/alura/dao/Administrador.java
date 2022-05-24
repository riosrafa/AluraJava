package br.com.alura.dao;

public class Administrador extends Funcionario {

    private int senha;

    @Override
    public double getBonificacao() {
        /*Lembrando que o metodo GetBonificacao é da classe pai, por isso, usamos o super para
        * atribuir o valor, ao inves do this. Outro pronto, o @override ( sobrescrita de um método ocorre quando uma classe filha implementa um método que já existe na classe mãe)*/
        return 350;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }

}