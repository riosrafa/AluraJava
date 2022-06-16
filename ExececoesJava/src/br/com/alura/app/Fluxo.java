package br.com.alura.app;

public class Fluxo {

    /*
    * @rafael maia: Os métodos static ou métodos da classe são funções que não
    * dependem de nenhuma variável de instância, quando invocados executam uma função sem a dependência do conteúdo de um objeto ou
    *  a execução da instância de uma classe, conseguindo chamar direto qualquer método da classe
    * e também manipulando alguns campos da classe
    * */
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
            System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
                int a = i /0;
        }
        System.out.println("Fim do metodo2");
    }
}
