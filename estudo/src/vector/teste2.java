package vector;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        int[] numero = new int[10];
        int soma = 0;

        System.out.println("Digite os valores que serão realizados as somas : ");
        for (int i =0; i < numero.length;i++) {
            System.out.println("Digite o " + (i+1)  + "° numero, do vetor");
            numero[i] = dados.nextInt();
            soma += numero[i];
        }

        System.out.println("A soma total dentro dos vetores é :" + soma);

        dados.close();
        
    }
    
}
