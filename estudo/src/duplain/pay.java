package duplain;
import java.util.Scanner;

class pagamento {

    private String usuario;
    private double saldo;

    public pagamento(String usuario, double saldo){
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public void processar_pagamento() {
        this.saldo = saldo;
    }
    
    public String getusuario() {
        return usuario;
    }

    public double getsaldo() {
        return saldo;
    }

}

class cartao_credito extends pagamento {

    private double saldo;

     public cartao_credito(String usuario, double saldo) {
        super(usuario, saldo);
        System.out.println("Seu metódo de pagamento é cartão de crédito");
     }

}

class boleto extends pagamento {

    private double saldo;

    public boleto(String usuario, double saldo) {
        super(usuario, saldo);
    }


}

public class pay {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeC = entrada.nextLine();

        System.out.println("Digite o valor do seu boleto ?");
        double boletoC = entrada.nextInt();

        System.out.println("Opções de pagamento: ");
        System.out.println("Crédito");
        System.out.println("Boleto");

        System.out.println("Qual metódo de pagamento você deseja?");
        String metodo = entrada.nextLine();
        
        entrada.nextLine();

        if (metodo.equalsIgnoreCase("boleto")) {
            pagamento pag = new boleto(nomeC, boletoC);

            System.out.println("Seu boleto será no valor de :" + pag.getsaldo());

        } else if (metodo.equalsIgnoreCase("crédito")) {
            pagamento pag2 = new cartao_credito(nomeC, boletoC);

            System.out.println("Seu cartão de crédito no próximo mês será cobrado um valor de : " + pag2.getsaldo());

        } else {
            System.out.println("Fora de opção!");
        }
        

    }
    
}
