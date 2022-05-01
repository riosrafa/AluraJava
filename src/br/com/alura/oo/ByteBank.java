package br.com.alura.oo;

public class ByteBank {
    private String nome;
    private int agencias;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private static int totalContas;

    public ByteBank() {
        totalContas++;
        System.out.println(totalContas);
    }

    public ByteBank(String nome, int agencias, int numero, double saldo, Cliente cliente) {
        this.nome = nome;
        this.agencias = agencias;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double pegaSaldo(ByteBank aux){
        return this.saldo;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
       if (this.saldo >= valor){
           this.saldo -=valor;
       }else {
           return false;
       }
       return true;
    }

    public boolean transfere(double valor, ByteBank conta){
        if(this.saldo >= valor){
           /*maneira simples de se resolver, ou podemos reutilizar o metodo deposita*/
            // conta.saldo += valor;
            this.saldo -= valor;
           conta.deposita(valor);
            return true;
        }
            return false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public int getAgencias() {
        return agencias;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencias(int agencias) {
        this.agencias = agencias;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTotalContas(int totalContas) {
        ByteBank.totalContas = totalContas;
    }

    @Override
    public String toString() {
        return "ByteBank{" +
                "nome='" + nome + '\'' +
                ", agencias=" + agencias +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
