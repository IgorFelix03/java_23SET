package duplain;
import java.util.Scanner;

class alunoU {
    private String nome;
    private double nota;

    public alunoU(String nome, double nota) {
        this.nome = nome;
        setnota(nota);
    }

    public void setaluno(String nome) {

        this.nome = nome;

    }

    public void setnota(double nota) {
        if ((nota >= 0) && (nota <= 10.0)) {
            this. nota = nota;
            System.out.println("Nota dentro do permitido");
        } else {
            System.out.println("Nota fora dos parametros");
            this.nota = 0.0;
        }
    }


    public String getnome() {
        return nome;
    }

    public double getnota() {
        return nota;
    }

}

public class aluno {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nomeDigita = dados.nextLine();

        System.out.println("Digite a nota de 0 a 10");
        double notaDigitada = dados.nextDouble();

        alunoU alunaP = new alunoU(nomeDigita, notaDigitada);
        
        System.out.println("----------- dados :");
        System.out.println("Nome do aluno :" + alunaP.getnome());
        System.out.println("Nota final :" + alunaP.getnota());

        dados.close();
        
    }
    
}
