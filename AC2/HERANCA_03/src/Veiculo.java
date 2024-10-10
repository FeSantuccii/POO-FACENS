package Veiculos;

// Classe abstrata representando um veículo
public abstract class Veiculo {
	
    //Atributos da classe Veiculo
    private String modeloVeiculo;
    private int anoDeFabricacao;
    private String fabricante;
    private String corVeiculo;
    private double kmRodados;
    
    // Construtor da classe Veiculo
    public Veiculo(String modeloVeiculo, int anoDeFabricacao, String fabricante, String corVeiculo, double kmRodados) {
        // Chamando métodos de validação
        setModeloVeiculo(modeloVeiculo);
        setAnoDeFabricacao(anoDeFabricacao);
        setFabricante(fabricante);
        setCorVeiculo(corVeiculo);
        setKmRodados(kmRodados);
    }
    
    // Métodos de acesso (getters e setters)
    public String getModeloVeiculo() {
        return modeloVeiculo;
    }
    
    // Validação do modelo do veículo
    public void setModeloVeiculo(String modeloVeiculo) {
        if (modeloVeiculo == null || modeloVeiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo é obrigatório.");
        }
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    // Validação do ano de fabricação
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        if (anoDeFabricacao < 1950 || anoDeFabricacao > 2025) {
            throw new IllegalArgumentException("Ano de fabricação inválido.");
        }
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }
    
    // Método abstrato para gerar comando SQL INSERT
    public abstract String criarComandoInsert();
}
