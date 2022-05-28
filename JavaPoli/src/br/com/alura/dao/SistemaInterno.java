package br.com.alura.dao;

public class SistemaInterno {

    int senha = 222;
    public void autentica(Gerente gerente) {

        boolean autentic = gerente.autentica(this.senha);
        if (autentic) {
            System.out.println("Funcionario auntenticado: " );
        }else {
            System.out.println("Funcionario não autenticado: ");
        }
    }
}
