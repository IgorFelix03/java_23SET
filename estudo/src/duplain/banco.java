package duplain;
import java.util.Scanner;

class contaBancaria {
    private String titular;
    private double saldo;

    
    public contaBancaria (String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double moeda) {

        if(moeda > 0) {
            saldo += moeda;
            System.out.printf("Após o deposito é : %.2f", saldo);
        }
    }

    public void saque(double moeda) {
        
        if (saldo > 0 && moeda <= saldo) {
            saldo -= moeda;
            System.out.printf("Saque efetuado! Moedas restantes %.2f", saldo);
        } else { 
            System.out.println("Saldo insuficiente para a retirada!");
        }
    }

    public String gettitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


}


public class banco {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        contaBancaria bb = new contaBancaria("Igor", 5000);

        System.out.println(" Bem vindo ao banco Igor Mercantil");
        System.out.println("Você deseja sacar ou depositar dinheiro ?");
        String opcao = dados.next();

        if (opcao.equalsIgnoreCase("sacar")) {

            System.out.println("Quanto deseja sacar ?");
            double recebidos = dados.nextDouble();
            bb.saque(recebidos);
        } else if (opcao.equalsIgnoreCase("depositar")) {
            System.out.println("Quanto deseja depositar ?");
            double retirados = dados.nextDouble();
            bb.deposito(retirados);
        } else {
            System.out.println("Inicie a operação novamente");
        }

        dados.close();
    }
    
}
