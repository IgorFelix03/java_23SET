package duplain;
import java.util.Scanner;

class modelo_car {
    private String marca;
    private String modelo;
    private double velocidade;

    public modelo_car(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println("O carro acelerou! Nova velocidade: " + velocidade + " km/h");
    }

    public void frear(double decremento) {
        if (decremento <= velocidade) {
            velocidade -= decremento;
            System.out.println("O carro freou. Nova velocidade: " + velocidade + " km/h");
        } else {
            velocidade = 0;
            System.out.println("O carro parou completamente!");
        }
    }

    public String getmarca() {
        return marca;
    }

    public String getmodelo() {
        return modelo;
    }
    
    public double getvelocidade() {
        return velocidade;
    }
}

public class carro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        modelo_car carros = new modelo_car("BMW", "2019", 50.0);

        System.out.println("A marca do carro é: " + carros.getmarca() + ", o modelo é do ano: " + carros.getmodelo() + " e sua velocidade atual é: " + carros.getvelocidade() + " km/h.");
        System.out.println("Você deseja acelerar ou frear?");
        String acao = entrada.next();

        if (acao.equalsIgnoreCase("acelerar")) {
            System.out.println("Quanto deseja acelerar?");
            double quantoAc = entrada.nextDouble();
            carros.acelerar(quantoAc);
        } 
        else if (acao.equalsIgnoreCase("frear")) {
            System.out.println("Quanto deseja frear/reduzir?");
            double quantoFr = entrada.nextDouble();
            carros.frear(quantoFr);
        } else {
            System.out.println("Ação inválida!");
        }

        entrada.close();   
    }
}