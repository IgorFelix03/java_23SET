package vector;

import java.util.Scanner;

public class teste5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

            int numero[] = new int[8];
            boolean encontrado = false;

            for (int i = 0; i < numero.length; i++) {
                System.out.println("Digite o " + (i+1) + "° numero");
                numero[i] = entrada.nextInt();
            }

            System.out.println("Vamos pesquisar?");
            System.out.println("Qual número deseja pesquisar? ");
            int numP = entrada.nextInt();

            for (int i = 0; i < numero.length; i++) {
                if (numero[i] == numP ) {
                    System.out.println(" Esse número existe na posição : " + (i+1));
                    encontrado = true;
                } 
            }
                if (!encontrado) {
                    System.out.println("Não encontrado");
                }

                entrada.close();

            }

    }
    

