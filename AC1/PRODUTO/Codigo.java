import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Produto { //Criação produto
    private String nome;
    private String marca;
    private double precoCusto;
    private double precoVenda;

    public Produto(String nome, String marca, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double calcularLucro() { //Calculo do calcularLucro
        return precoVenda - precoCusto;
    }

    public void mostrarInformacoes() { //Mostrar informações do produto
        double lucro = calcularLucro();
        System.out.printf("Produto: %s, Marca: %s, Preço de Custo: R$%.2f, Preço de Venda: R$%.2f, Lucro: R$%.2f%n", 
                          nome, marca, precoCusto, precoVenda, lucro);
    }
}

class Pessoa { //Criação pessoa
    private String nomeCompleto;
    private double altura;
    private LocalDate dataNascimento;
    private String email;

    public Pessoa(String nomeCompleto, double altura, String dataNascimentoStr) {
        this.nomeCompleto = nomeCompleto;
        this.altura = altura;
        this.dataNascimento = validarDataNascimento(dataNascimentoStr);
        this.email = criarEmail();
    }

    private LocalDate validarDataNascimento(String dataNascimentoStr) {  //Não deixa a data de nascimento ser hoje ou depois
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Tente nascer antes de hoje!");
        }
        return dataNascimento;
    }

    private String criarEmail() {//criação do email
        String[] partes = nomeCompleto.toLowerCase().split(" ");
        return partes[0] + "." + partes[1] + "@dominio.com";
    }

    public void mostrarInformacoes() { //mostrar informações da pessoa
        System.out.printf("Nome: %s, Altura: %.2fm, Data de Nascimento: %s, Email: %s%n", 
                          nomeCompleto, altura, dataNascimento, email);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação produtos
        Produto produto1 = new Produto("Caderno", "Tilibra", 5.00, 10.00);
        Produto produto2 = new Produto("Caneta", "BIC", 1.00, 3.00);

        // Mostrar informações dos produtos
        produto1.mostrarInformacoes();
        produto2.mostrarInformacoes();

        // Criando pessoas
        Pessoa pessoa1 = new Pessoa("João Silva", 1.75, "1990-05-20");
        Pessoa pessoa2 = new Pessoa("Maria Oliveira", 1.60, "1995-08-15");

        // Mostrar informações das pessoas
        pessoa1.mostrarInformacoes();
        pessoa2.mostrarInformacoes();
    }
}
