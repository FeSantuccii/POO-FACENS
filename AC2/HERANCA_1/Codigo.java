public class Main {

    public static void main(String[] args) {//Criando pessoas
        //fisicas
        PessoaFisica pf1 = new PessoaFisica("Daniel Ohata", "123.456.789-00", "Rua Agora vai, 123", "Ohata@gmail.com");
        PessoaFisica pf2 = new PessoaFisica("Felipe Santucci", "987.654.321-00", "Rua Antonio Rodrigues, 456", "joao@gmail.com");

        //juridicas
        PessoaJuridica pj1 = new PessoaJuridica("FACENS", "12.345.678/0001-90", "Rua Facens, 789", "contato@facens.com");
        PessoaJuridica pj2 = new PessoaJuridica("Coca-Cola", "98.765.432/0001-01", "Avenida São Paulo, 101", "contato@cocacola.com");

        //funcionarios
        Funcionario f1 = new Funcionario("Ana Pereira", "111.222.333-44", "Rua Estácio, 12", 3000.00);
        Funcionario f2 = new Funcionario("Carlos Souza", "555.666.777-88", "Rua Fernando Sabugosa, 34", 4500.00);

        // Exibindo os dados
        System.out.println(pf1);
        System.out.println(pf2);
        System.out.println(pj1);
        System.out.println(pj2);
        System.out.println(f1);
        System.out.println(f2);
    }

    static class Pessoa { //CRIAÇÃO DA CLASSE MÃE
        protected String nome;
        protected String endereco;
        protected String email;

        public Pessoa(String nome, String endereco, String email) {
            this.nome = nome;
            this.endereco = endereco;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Endereço: " + endereco + ", Email: " + email;
        }
    }

    static class PessoaFisica extends Pessoa { //Subclasse pessoa fisica, puxando os dados da Pessoa por Herança
        private String cpf;

        public PessoaFisica(String nome, String cpf, String endereco, String email) {
            super(nome, endereco, email);
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            return "Pessoa Fisica [CPF: " + cpf + ", " + super.toString() + "]"; //pessoa FISICA tem como particular o CPF
        }
    }

    static class PessoaJuridica extends Pessoa { //Subclasse pessoa juridica, puxando os dados da Pessoa por Herança
        private String cnpj;

        public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
            super(nome, endereco, email);
            this.cnpj = cnpj;
        }

        @Override
        public String toString() {
            return "Pessoa Juridica [CNPJ: " + cnpj + ", " + super.toString() + "]"; //pessoa juridica tem como particular o CNPJ
        }
    }

    static class Funcionario extends Pessoa { //Subclasse do funcionario, puxando os dados da Pessoa por Herança
        private String cpf;
        private double salario;

        public Funcionario(String nome, String cpf, String endereco, double salario) {
            super(nome, endereco, null); // email não foi pedido
            this.cpf = cpf;
            this.salario = salario;
        }

        @Override
        public String toString() {
            return "Funcionario [CPF: " + cpf + ", Salário: " + salario + ", " + super.toString() + "]"; //FUNCIONARIO tem como particular o SALARIO E CPF
        }
    }
}
