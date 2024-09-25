public class ContaBancaria {
    private double saldo;
    private int consultas;

  //criação classes e atributos CONTA
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.consultas = 0;
    }

    //Deposito com a taxa de 1%, com o saldo calculado em cima do 1%
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        saldo += valor - taxa;
        System.out.printf("Depósito: R$%.2f (taxa de R$%.2f aplicada). Saldo atual: R$%.2f%n", valor, taxa, saldo);
    }

    //Saque, com 0,5% de taxa, com saldo calculado em cima
    public void sacar(double valor) {
        double taxa = valor * 0.005; 
        if (saldo >= (valor + taxa)) {
            saldo -= (valor + taxa);
            System.out.printf("Saque: R$%.2f (taxa de R$%.2f aplicada). Saldo atual: R$%.2f%n", valor, taxa, saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque."); //Aviso do saque sem fundo
        }
    }

    //Consulta de saldo, com a taxa a cada 5
    public double consultarSaldo() {
        consultas++;
        if (consultas % 5 == 0) {
            saldo -= 0.10;
            System.out.printf("Taxa de R$0.10 aplicada por consulta. Saldo atual: R$%.2f%n", saldo);
        }
        return saldo;
    }

    //Saldo DIRETO
    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        //TESTES
        ContaBancaria conta = new ContaBancaria(1000.00);

        //5 Consultas
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        System.out.println("Saldo: R$" + conta.consultarSaldo());

        // TESTE Depósito
        conta.depositar(200.00);

        // TESTE Saque
        conta.sacar(100.00);
        
        // Consulta após transações
        System.out.println("Saldo: R$" + conta.consultarSaldo());
    }
}
