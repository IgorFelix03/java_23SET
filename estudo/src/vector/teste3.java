package vector;
import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero[] = new int[6];

        System.out.println("Digite 6 números");
        System.out.println("Digite o 1° numero");
        numero[0] = entrada.nextInt();

        int maior = numero[0], menor = numero[0];


        for (int i = 1; i < numero.length; i++) {
            System.out.println("Digite o " + (i+1) + "° numero" );
            numero[i] = entrada.nextInt();
            if (numero[i] > maior) {
                maior = numero[i];
            } if (numero[i] < menor) {
                menor = numero[i];
            }


        }

        System.out.println(menor);
        System.out.println(maior);

        entrada.close();
        
    }
    
}
