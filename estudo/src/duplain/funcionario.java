package duplain;
import java.util.Scanner;

class func {

        private String nome;
        private double salario;

        public func(String nome, double salario){
            this.nome = nome;
            this.salario = salario;
        }

        public String getnome() {
            return nome;
        }

        public double getsalario() {
            return salario;
        }
}

  class Gerente extends func {

       private String senha;

       public Gerente(String nome, double salario, String senha) {
        super(nome, salario);
        this.senha = senha;
       }

       public String getsenha() {
        return senha;
       }

    }



public class funcionario {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do gerente: ");
        String nomeF = entrada.nextLine();

        System.out.println("Digite seu salario: ");
        double salarioF = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Digite a senha de acesso do gerente : ");
        String senhaF = entrada.nextLine();

        Gerente funcionario1 = new Gerente(nomeF, salarioF, senhaF);

        System.out.println(funcionario1.getnome());
        System.out.println(funcionario1.getsalario());
        System.out.println(funcionario1.getsenha());



    entrada.close();
    }
    
    
}
