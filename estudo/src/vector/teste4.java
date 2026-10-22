package vector;
import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero[] = new double[4];
        double media = 0, soma = 0;
        
        System.out.println("Insira as notas do aluno");
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite a nota " + ( i + 1 ) + "° do aluno");
            numero[i] = entrada.nextInt();
            soma += numero[i];
        }

        media = soma/4;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
        
    }
    
}
