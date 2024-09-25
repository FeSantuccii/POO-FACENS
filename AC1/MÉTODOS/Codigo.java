public class Main {

    //Deixar 0+ como positivo
    public static String verificarPositivoOuNegativo(int numero) {
        return (numero >= 0) ? "O número " + numero + " é positivo." : "O número " + numero + " é negativo.";
    }

    //Média de 3 numeros
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    //Máximo de 3 numeros
    public static double maiorNumero(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    //a concatenado b
    public static String concatenarNumeros(int a, int b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    //minutos em horas minutos
    public static String converterMinutosParaHoras(int minutos) {
        int horas = minutos / 60;
        int restoMinutos = minutos % 60;
        return horas + " hora(s) e " + restoMinutos + " minuto(s)";
    }

    //Fatorial do numero
    public static long fatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo.");
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        //Testes

        //positivos
        System.out.println(verificarPositivoOuNegativo(5));
        System.out.println(verificarPositivoOuNegativo(-3));

        //médias
        double media = calcularMedia(5.0, 10.0, 15.0);
        System.out.println("Média: " + media);

        //maior
        double maior = maiorNumero(5.0, 10.0, 3.0);
        System.out.println("Maior número: " + maior);

        //concatenar
        String concatenacao = concatenarNumeros(2, 3);
        System.out.println("Concatenar 2 e 3: " + concatenacao);

        // Converter minutos em horas e minutos
        String conversao = converterMinutosParaHoras(90);
        System.out.println("90 minutos equivalem a: " + conversao);

        // Calcular fatorial
        long fatorialDe5 = fatorial(5);
        System.out.println("Fatorial de 5: " + fatorialDe5);
    }
}
