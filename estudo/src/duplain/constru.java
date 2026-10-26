package duplain;
import java.util.Scanner;

class produto {
    private String nome;
    private double preco;
    private int estoque;

    public produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;        
        this.estoque = estoque;
    }

    public String getnome() {
        return nome;
    }

    public double getpreco() {
        return preco;
    }

    public int getestoque() {
        return estoque;
    }

}

public class constru {
    public static void main(String[] args) {

    produto produtos = new produto("Teclado mecanico", 15000.00, 50);
    
    System.out.println("Produto  : " + produtos.getnome());
    System.out.println("Valor : " + produtos.getpreco());
    System.out.println("Quantidade :" + produtos.getestoque());
  
    }

}
