import java.util.Scanner;
public class Exercicio1 {

    public static void mostrarCabecalho() {
        System.out.println("Sistema de Análise de Notas");
        System.out.println("===========================");
    }
    public static void preencherNotas(double[] notas, Scanner entrada) {
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
    }
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            soma += notas[i];
        }
        return soma /6;
    }
    public static int contarAprovados(double[] notas) {
        int aprovados = 0;
        for (int i =0; i< 6; i++) {
            if (notas[i] >= 6.0) {
                aprovados++;
            }
        }
        return aprovados;
    }
    public static void mostrarNotas(double[] notas) {
        for (int i= 0; i< 6; i++) {
            System.out.println("Nota do aluno "+ (i +1)+ ": "+ notas[i]);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[6];

        mostrarCabecalho();
        preencherNotas(notas, entrada);
        double media = calcularMedia(notas);
        int aprovados = contarAprovados(notas);
        int reprovados =6 - aprovados;

        mostrarNotas(notas);
        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);
    }
}