package Veiculos;

// Classe que representa um skate
public class Skate extends Veiculo {
    // Atributos da classe Skate
    private String nomeMarca;
    private String tipoDeRodas;
    
    // Construtor da classe Skate
    public Skate(String modelo, int anoDeFabricacao, String fabricante, String cor, double kmRodados,
                 String nomeMarca, String tipoDeRodas) {
        super(modelo, anoDeFabricacao, fabricante, cor, kmRodados);
        this.nomeMarca = nomeMarca;
        this.tipoDeRodas = tipoDeRodas;
    }

    // Método para gerar o comando SQL de inserção dos dados do skate
    @Override
    public String criarComandoInsert() {
        return String.format("INSERT INTO Skate (modelo, ano_fabricacao, fabricante, cor, km_rodados, " +
                             "marca, tipo_rodas) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', '%s');",
                             getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             nomeMarca, tipoDeRodas);
    }
}
