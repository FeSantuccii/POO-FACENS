public class Filme { //criação dos atributos
    private String titulo;
    private int duracao; 
    private String genero;

    public Filme(String titulo, int duracao, String genero) { //Criação da classe
        setTitulo(titulo);
        setDuracao(duracao);
        setGenero(genero);
        
    public void setTitulo(String titulo) { //Impedimento de título vazio
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Coloque um título");
        }
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {//Necessidade de inserir duração
        if (duracao <= 0) {
            throw new IllegalArgumentException("Insira a duração do filme");
        }
        this.duracao = duracao;
    }

    public void setGenero(String genero) { //Genero dentro dos pedidos
        if (!genero.equals("Romance") && !genero.equals("Terror") && !genero.equals("Comédia")) {
            throw new IllegalArgumentException("GÊNERO INVALIDO: O gênero deve ser Romance/Terror/Comédia.");
        }
        this.genero = genero;
    }
    //Retornar os valores recebidos
    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    //Apresentar as respostas
    public static void main(String[] args) {
        try {
            Filme filme = new Filme("O Ohata do banheiro", 100, "Terror");
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("Duração: " + filme.getDuracao() + " minutos");
            System.out.println("Gênero: " + filme.getGenero());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
