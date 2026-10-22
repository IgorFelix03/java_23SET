package choice_es;
import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Escolha qual moeda deseja fazer a conversão:");
        System.out.println("1 para libra");
        System.out.println("2 para dolar");
        System.out.println("3 para euro");
        System.out.println();
        int Tipo_moeda = dados.nextInt();

        System.out.println("Quanto deseja fazer a conversão ?");
        double moeda = dados.nextDouble();

        switch (Tipo_moeda) {
            case 1:
                moeda /= 7.50;
                System.out.printf("Você receberá : %.2f", moeda);
                break;

            case 2:
                moeda /= 5.50;
                System.out.printf("Você receberá : %.2f", moeda);
                break;

            case 3:
                moeda /= 2;
                System.out.printf("Você receberá : %.2f",moeda);
                break;
        
            default:

                System.out.println("Moeda não reconhecida!");
                break;
        }

        dados.close();
        
    }
    
}
