package choice_es;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        
    Scanner dados = new Scanner(System.in);

        System.out.println("Digite sua nota");
        String nota = dados.next();

        switch (nota) {
            case "A":
                System.out.println("Aprovado com excelencia");
                break;
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
                System.out.println("Recuperação");
                break;
            case "D":
                System.out.println("Recuperação!");
                break;
            case "F":
                System.out.println("Bomba direto");
                break;
        
            default:
                System.out.println("Fora dos parametros esperados");
                break;
        }


    dados.close();

    }

}
