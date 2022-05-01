package br.com.alura.oo;

public class Cliente {


    private String cpf;
    private String nome;
    private String profissao;
    private String stress;
    private int idade;


    public Cliente() {
    }

    public Cliente(String cpf, String nome, String profissao, String stress, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
        this.stress = stress;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getStress() {
        return stress;
    }

    public int getIdade() {
        return idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                ", stress='" + stress + '\'' +
                ", idade=" + idade +
                '}';
    }
}
