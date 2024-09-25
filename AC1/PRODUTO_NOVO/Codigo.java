import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Criação de classes e atributos
public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {    //Receber o produto
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1); // vai adicionar 1 mes
    }

    //Calculo de preço venda e | nome e preço 
    public Produto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10; //10%
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plusMonths(1); //+1 mes, conforme solicitado
    }
//get e set para cada um
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {//Pedindo e recebendo do usuario 
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço de custo:");
        double precoCusto = scanner.nextDouble();
        System.out.println("Digite o preço de venda:");
        double precoVenda = scanner.nextDouble();
        System.out.println("Digite a data de fabricação (dd/MM/yyyy):");
        scanner.nextLine();
        String dataFabricacaoStr = scanner.nextLine();
        LocalDate dataFabricacao = LocalDate.parse(dataFabricacaoStr, formatter);

      //Mostrando os dados recebidos
        Produto produto = new Produto(nome, precoCusto, precoVenda, dataFabricacao);
        System.out.println("Produto criado: " + produto.getNome());
        System.out.println("Preço de custo: " + produto.getPrecoCusto());
        System.out.println("Preço de venda: " + produto.getPrecoVenda());
        System.out.println("Data de fabricação: " + produto.getDataFabricacao());
        System.out.println("Data de validade: " + produto.getDataValidade());

        scanner.close();
    }
}
