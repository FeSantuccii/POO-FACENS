package Veiculos; 

// Classe que representa uma bicicleta
class Bicicleta extends Veiculo {
    // Atributos da classe Bicicleta
    private String nomeMarca;
    private String tipoMaterial;
    private int numeroMarchas;
    private boolean temAmortecedor;
    
    // Construtor da classe Bicicleta
    public Bicicleta(String modelo, int anoDeFabricacao, String fabricante, String cor, double kmRodados,
                     String nomeMarca, String tipoMaterial, int numeroMarchas, boolean temAmortecedor) {
        super(modelo, anoDeFabricacao, fabricante, cor, kmRodados);
        this.nomeMarca = nomeMarca;
        this.tipoMaterial = tipoMaterial;
        this.numeroMarchas = numeroMarchas;
        this.temAmortecedor = temAmortecedor;
    }

    // Método para gerar o comando SQL de inserção dos dados da bicicleta
    @Override
    public String criarComandoInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, ano_fabricacao, fabricante, cor, km_rodados, " +
                             "marca, material, quantidade_marchas, amortecedor) VALUES ('%s', %d, '%s', '%s', %.2f, '%s', '%s', %d, %b);",
                             getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             nomeMarca, tipoMaterial, numeroMarchas, temAmortecedor);
    }
}
