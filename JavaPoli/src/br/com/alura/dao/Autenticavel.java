package br.com.alura.dao;

public abstract interface Autenticavel {

/*
* contrato auntenticavel
*   quem assinar esse contrato, precisa implementar
*       metodo s*/

    public void setSenha(int senha);
    public abstract  boolean autentica(int senha);
}
