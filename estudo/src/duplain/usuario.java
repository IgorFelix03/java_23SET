package duplain;
import java.util.Scanner;


 class pessoa {
        private String Usuario;
        private int idade;

    public pessoa(String Usuario, int idade) {
        this.Usuario = Usuario;
        this.idade = idade;
    }

    public void cadastro (String Usuario, int idade) {
        System.out.println("O nome do usuario é: " + Usuario );
        System.out.println("Sua idade é : " + idade);
    }
        
    public String getUsuario() {
        return Usuario;
    }

    public int getidade() {
        return idade;
    }

    }

public class usuario {
    public static void main(String[] args) {

    pessoa user = new pessoa("Igor", 18);

   System.out.println("Nome do usuario: " + user.getUsuario());
   System.out.println("Sua idade é : " + user.getidade());

    }
  
}
