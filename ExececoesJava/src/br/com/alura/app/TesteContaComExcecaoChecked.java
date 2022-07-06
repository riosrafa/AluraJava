package br.com.alura.app;

public class TesteContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta c = new Conta();
        try {
           c.deposita();
        }catch (MyException e){

        }
    }

}
