package Veiculos;

// Classe que representa uma motocicleta
class Motocicleta extends Veiculo {
    // Atributos da classe Motocicleta
    private int capacidadeCilindrada;
    private double valorTorque;
    
    // Construtor da classe Motocicleta
    public Motocicleta(String modelo, int anoDeFabricacao, String fabricante, String cor, double kmRodados,
                       int capacidadeCilindrada, double valorTorque) {
        super(modelo, anoDeFabricacao, fabricante, cor, kmRodados);
        this.capacidadeCilindrada = capacidadeCilindrada;
        this.valorTorque = valorTorque;
    }

    // Método para gerar o comando SQL de inserção dos dados da motocicleta
    @Override
    public String criarComandoInsert() {
        return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, fabricante, cor, km_rodados, " +
                             "cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                             getModelo(), getAnoDeFabricacao(), getMontadora(), getCor(), getQuilometragem(),
                             capacidadeCilindrada, valorTorque);
    }
}
