package br.com.alura.dao;

public class Gerente extends Funcionario {

    private int senha;

    @Override
    public double getBonificacao() {
        /*Lembrando que o metodo GetBonificacao é da classe pai, por isso, usamos o super para
        * atribuir o valor, ao inves do this. Outro pronto, o @override ( sobrescrita de um método ocorre quando uma classe filha implementa um método que já existe na classe mãe)*/
        return super.getBonificacao() + super.getSalario();
    }
    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }
}