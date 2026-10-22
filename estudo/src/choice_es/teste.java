package choice_es;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double soma;

        System.out.println("Digite o tipo de conta que você deseja por escrito(+,-,*,/)");
        String calculadora = entrada.next();
        
        System.out.println("Digite o primeiro número da operação!");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número da operação");
        int num2 = entrada.nextInt();
        
        switch (calculadora) {
            case "*":
                soma = num1 * num2;
                System.out.printf("A multiplicação resultante é : %.2f",soma);
                break;
            case "-":
                soma = num1 - num2;
                System.out.printf("A subtração resultante é : %.2f",soma);
                break;
            case "+":
                soma = num1 + num2;
                System.out.printf("A soma resultante é : %.2f",soma);
                break;
            case "/":
                if ((num1 != 0) && (num2 != 0)) {
                    soma = (double)num1 / num2;
                    System.out.printf("A divisão resultante é : %.2f",soma);
                } else {
                    System.out.println("Não dividimos números por zero");
                }
                break;
            default:
                System.out.println("Valor incorreto");
                break;
        }

        entrada.close();
    }
    
}
