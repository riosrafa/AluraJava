package br.com.alura.app;

import br.com.alura.dao.ControleBonificacao;
import br.com.alura.dao.EditorVideo;
import br.com.alura.dao.Funcionario;
import br.com.alura.dao.Gerente;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(5000);
        System.out.println(funcionario.getBonificacao());

        Gerente gerente = new Gerente();
        gerente.setNome("joao");
        gerente.setCpf("00000000000");
        gerente.setSalario(5000);

        /*Invocando metodos da classe PAI (Funcionario)*/
        System.out.println("######################");
        System.out.println("Cargo: " + " Nome: " + gerente.getNome());
        System.out.println("Doc " + " Cpf: " + gerente.getCpf());
        System.out.println("Salario: " + gerente.getSalario());
        System.out.println("######################");

        /*Invocando metodos da classe filha(Gerente) */
        gerente.setSenha(777);
        /*Metodo boolean para tratar o retorno da informação*/
        boolean autentica = gerente.autentica(777);
        System.out.println(autentica);

        /*Nesse ponto, devemos lembrar o seguinte. o java cuida para chamar o metodo
        * Bonificacao correto, ele invoca o objeto que chamou o metodo, caso seja,
        * da classe filha, ele irá buscar o metodo da classe filha.*/
        System.out.println(gerente.getBonificacao());

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(7000);

        ControleBonificacao cb = new ControleBonificacao();
        cb.registra();


    }
}
