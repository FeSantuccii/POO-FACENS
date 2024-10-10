package Veiculos;

// Classe que representa um automóvel
public class Automovel extends Veiculo {
    // Atributos da classe Automovel
    private int maxPassageiros;
    private String sistemaFreio;
    private boolean possuiAirbag;

    // Construtor da classe Automovel
    public Automovel(String modelo, int anoDeFabricacao, String fabricante, String cor, double kmRodados,
                     int maxPassageiros, String sistemaFreio, boolean possuiAirbag) {
        super(modelo, anoDeFabricacao, fabricante, cor, kmRodados);
        this.maxPassageiros = maxPassageiros;
        this.sistemaFreio = sistemaFreio;
        this.possuiAirbag = possuiAirbag;
    }

    // Método para gerar o comando SQL de inserção dos dados do automóvel
    @Override
    public String criarComandoInsert() {
        return String.format("INSERT INTO Automovel (modelo, ano_fabricacao, fabricante, cor, km_rodados, " +
                             "max_passageiros, sistema_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                             getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             maxPassageiros, sistemaFreio, possuiAirbag);
    }
}
