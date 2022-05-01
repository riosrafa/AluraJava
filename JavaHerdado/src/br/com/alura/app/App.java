package br.com.alura.app;

import br.com.alura.dao.Funcionario;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(5000);
        System.out.println(funcionario.getBonificacao());
    }
}
