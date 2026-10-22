package choice_es;
import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o mês desejado para descobrir qual estação do ano (1 a 12) ");
        int mes = dados.nextInt();

        switch (mes) {
            case 1,2,3:
                System.out.println("Estamos no inverno");
                break;

            case 4,5,6:
                System.out.println("Estamos no verão");
                break;
            case 7,8,9:
                System.out.println("Estamos na primavera");
                break;
            case 10,11,12:
                System.out.println("Estamos no outono");
        
            default:
                System.out.println("Mês selecionado não existe");
                break;
        }

        dados.close();

    }
    
}
