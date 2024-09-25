import java.util.Scanner;

public class Aluno { //criação dos atributos
    private String nome;
    private String ra;
    private double[] notas;
    private double frequencia;
    private boolean ead;

    //Criação das classes
    public Aluno(String nome, String ra, double[] notas, double frequencia) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.frequencia = frequencia;
        this.ead = false;
    }

    // fazendo a diciplina ead
    public Aluno(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.ead = true;
    }

    //Calculo de nota final
    public double calcularNotaFinal() {
        double notaFinal = 0.0;
        int numNotas = notas.length;

        if (numNotas == 1 || numNotas == 2) {
            for (double nota : notas) {
                notaFinal += nota;
            }
            notaFinal /= numNotas;
        } else if (numNotas == 3) {
            //Media ponderada
            notaFinal = (notas[0] + 2 * notas[1] + 4 * notas[2]) / 7;
        } else if (numNotas == 4) {
            //Calculo de media
            notaFinal = (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
        }

        return notaFinal;
    }

    //Verificação com if
    public String verificarSituacao() {
        double notaFinal = calcularNotaFinal();
        if (ead) {
            return notaFinal >= 5 ? "Aprovado" : "Reprovado";
        } else {
            return (notaFinal >= 5 && frequencia >= 75) ? "Aprovado" : "Reprovado";
        }
    }

    //Mostrar informações
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota Final: " + calcularNotaFinal());
        System.out.println("Situação: " + verificarSituacao());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //Receber nome RA e notas
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite o RA do aluno:");
        String ra = scanner.nextLine();
        System.out.println("Digite o número de notas:");
        int numNotas = scanner.nextInt();
        double[] notas = new double[numNotas];

      //repetição para as diversas notas, declaradas anteriormente
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

      //recebendo o boolean do EAD
        System.out.println("O aluno está em uma disciplina EAD? (true/false):");
        boolean ead = scanner.nextBoolean();

        Aluno aluno;
        if (ead) {
            aluno = new Aluno(nome, ra, notas);
        } else {
            System.out.println("Digite a frequência do aluno:");
            double frequencia = scanner.nextDouble();
            aluno = new Aluno(nome, ra, notas, frequencia);
        }

        aluno.imprimirInformacoes();

        scanner.close();
    }
}
