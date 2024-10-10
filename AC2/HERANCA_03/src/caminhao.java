package Veiculos;

// Classe que representa um caminhão
public class Caminhao extends Veiculo {
    // Atributos da classe Caminhao
    private int numeroEixos;
    private double pesoTotal;
    
    // Construtor da classe Caminhao
    public Caminhao(String modelo, int anoDeFabricacao, String fabricante, String cor, double kmRodados,
                    int numeroEixos, double pesoTotal) {
        super(modelo, anoDeFabricacao, fabricante, cor, kmRodados);
        this.numeroEixos = numeroEixos;
        this.pesoTotal = pesoTotal;
    }
    
    // Método para gerar o comando SQL de inserção dos dados do caminhão
    @Override
    public String criarComandoInsert() {
        return String.format("INSERT INTO Caminhao (modelo, ano_fabricacao, fabricante, cor, km_rodados, " +
                             "numero_eixos, peso_total) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                             getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             numeroEixos, pesoTotal);
    }
}
