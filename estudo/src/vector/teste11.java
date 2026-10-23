package vector;

class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor para inicializar os dados da conta
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para levantar/sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Getter para consultar o saldo de forma segura
    public double getSaldo() {
        return saldo;
    }

    // Getter para consultar o titular
    public String getTitular() {
        return titular;
    }
}

// Classe Principal para testar o objeto
public class teste11 {
    public static void main(String[] args) {
        // Instanciando o objeto a partir da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria("Igor", 500.0);

        System.out.println("Titular da conta: " + minhaConta.getTitular());
        System.out.println("Saldo inicial: R$ " + minhaConta.getSaldo());

        // Realizando operações
        minhaConta.depositar(250.0);
        minhaConta.sacar(100.0);

        // Verificando o saldo final
        System.out.println("Saldo atualizado: R$ " + minhaConta.getSaldo());
    }
}