package choice_es;
import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 7 para representar um dia da semana");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
            case 3:
                System.out.println("Quarta-feira");
            case 4:
                System.out.println("Quinta-feira");
            case 5:
                System.out.println("Sexta-feira");
            case 6:
                System.out.println("Sabado");
            case 7:
                System.out.println("Domingo");
        
            default:
                System.out.println("invalido");
                break;
        }


        entrada.close();
    }
    
}

// 1. Dias da Semana
// Crie um programa que receba um número de 1 a 7 e use um switch para exibir o nome do dia correspondente (1 = Domingo, 2 = Segunda, etc.). Se o número for inválido, exiba uma mensagem de erro.
