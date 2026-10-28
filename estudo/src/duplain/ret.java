package duplain;
import java.util.Scanner;

class retangulo {

    private double largura;
    private double altura;

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setlargura(double largura) {
        this.largura = largura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double calc_area() {

        return largura*altura;
        
    }

    public double calc_perimetro() {
        return 2 * (largura+altura);
    }

    public double getlargura() {
        return largura;
    }

    public double getaltura() {
        return altura;
    }

}

public class ret {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular um triangulo!");
        System.out.println("Digite a altura do triangulo: ");
        double Qaltura = entrada.nextDouble();
        System.out.println("Digite a largura do triangulo: ");
        double Qlarguara = entrada.nextDouble();

        retangulo ret = new retangulo(Qlarguara, Qaltura);

        System.out.println("A altura definida foi : " + ret.getaltura());
        System.out.println("A largura definida foi : " +ret.getlargura());
        System.out.println("A área do triangulo é : " + ret.calc_area());
        System.out.println("O perímetro do triangulo é : " + ret.calc_perimetro());

        entrada.close();
    }
}
