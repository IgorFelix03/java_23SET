package vector;
import java.util.Scanner;
import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 numeros inteiros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número : " + (i+1) + ":");
            numeros[i] = dados.nextInt();
            soma += numeros[i];
        }

        System.out.println("Resultados:");
        System.out.println("Valores no vetor");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.printf("A soma dos numeros é : %d",soma);


        dados.close();

    }
    
}
