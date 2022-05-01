package br.com.alura.app;

import br.com.alura.oo.ByteBank;
import br.com.alura.oo.Cliente;

public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        ByteBank byteBank = new ByteBank();
        byteBank.setNome("joel");
        System.out.println(byteBank.getNome());

        ByteBank byteBank2 = new ByteBank();
        byteBank2.setSaldo(200.0);

        System.out.println(byteBank);
        System.out.println(byteBank2);

        byteBank.deposita(1500);

        byteBank.transfere(1000, byteBank2);

        cliente.setNome("rafael");
        cliente.setIdade(30);
        cliente.setCpf("222.222.22-22");
        cliente.setProfissao("Programdor");

        byteBank.setCliente(cliente);

        //aqui passamos a referencia do objeto cliente pro obj conta
        System.out.println(byteBank.toString());
        ///navegando entre os objetos
        System.out.println(byteBank.getCliente().getNome());

        ByteBank conta = new ByteBank();

        conta.setCliente(new Cliente());
        System.out.println(conta.getCliente().getNome());
        System.out.println(byteBank.getCliente());


        System.out.println("valor do byte 2 :" + byteBank2.pegaSaldo(byteBank2));
    }


}
