import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {//Criação dos cadastros
        //vendedores
        Vendedor vendedor1 = new Vendedor("Mariana Souza", "123.456.789-00", LocalDate.of(1990, 5, 15), LocalDate.of(2020, 1, 10), 3000.00, 0.1);
        Vendedor vendedor2 = new Vendedor("Lucas Almeida", "987.654.321-00", LocalDate.of(1985, 8, 20), LocalDate.of(2019, 3, 15), 3500.00, 0.15);

        //gerentes
        Gerente gerente1 = new Gerente("Fernanda Lima", "321.654.987-00", LocalDate.of(1980, 4, 10), LocalDate.of(2018, 6, 5), 6000.00, "Vendas");
        Gerente gerente2 = new Gerente("Ricardo Santos", "654.321.789-00", LocalDate.of(1975, 9, 25), LocalDate.of(2017, 11, 30), 7000.00, "Marketing");

        //clientes
        Cliente cliente1 = new Cliente("Ana Costa", "159.753.486-00", LocalDate.of(1995, 2, 14), "ana.costa@gmail.com", "1234567890", "(11) 91234-5678");
        Cliente cliente2 = new Cliente("Roberto Ferreira", "258.963.147-00", LocalDate.of(1988, 11, 22), "roberto.ferreira@gmail.com", "0987654321", "(11) 98765-4321");

        //Mostrando os dados
        System.out.println(vendedor1);
        System.out.println(vendedor2);
        System.out.println(gerente1);
        System.out.println(gerente2);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }

    static class Pessoa { //CRIANDO A MÃE PESSOA
        private String nome;
        private String cpf;
        private LocalDate dataNascimento;

        public Pessoa(String nome, String cpf, LocalDate dataNascimento) {//TODAS TEM EM COMUM: NOME / CPF / DATA DE NASCIMENTO
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
        }
    }

    static class Vendedor extends Pessoa { //Vendedor com a herança da Pessoa
        private LocalDate dataContratacao;
        private double salarioBase;
        private double percentualComissao;

      //atributos privados salario base, comissão e data de contratação
        public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
            super(nome, cpf, dataNascimento);
            this.dataContratacao = dataContratacao;
            this.salarioBase = salarioBase;
            this.percentualComissao = percentualComissao;
        }

        @Override
        public String toString() {
            return "Vendedor [" + super.toString() + ", Data de Contratação: " + dataContratacao + ", Salário Base: " + salarioBase + ", Percentual de Comissão: " + percentualComissao + "]";
        }
    }

    static class Gerente extends Pessoa { //Gerente com herança da pessoa
        private LocalDate dataContratacao;
        private double salarioBase;
        private String departamento;

        public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
            super(nome, cpf, dataNascimento); //herança da mãe
            this.dataContratacao = dataContratacao;
            this.salarioBase = salarioBase;
            this.departamento = departamento; //privados
        }

        @Override
        public String toString() {
            return "Gerente [" + super.toString() + ", Data de Contratação: " + dataContratacao + ", Salário Base: " + salarioBase + ", Departamento: " + departamento + "]";
        }
    }

    static class Cliente extends Pessoa { //cliente com herança da mãe PESSOA
        private String email;
        private String numeroCartaoFidelidade;
        private String telefone;

        public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
            super(nome, cpf, dataNascimento);
            this.email = email;
            this.numeroCartaoFidelidade = numeroCartaoFidelidade;
            this.telefone = telefone; //PRIVADOS
        }

        @Override
        public String toString() {
            return "Cliente [" + super.toString() + ", Email: " + email + ", Número do Cartão de Fidelidade: " + numeroCartaoFidelidade + ", Telefone: " + telefone + "]";
        }
    }
}
