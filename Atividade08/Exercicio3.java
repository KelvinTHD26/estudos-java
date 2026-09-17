package Atividade08;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int aluno = 0; aluno < 4; aluno++) {
            System.out.println("Informe o nome do " + (aluno + 1) + "º aluno: ");
            nomes[aluno] = entrada.nextLine();
            for (int avaliacao = 0; avaliacao < 3; avaliacao++) {
                System.out.println("Informe a nota " + (avaliacao + 1) + " de " + nomes[aluno] + ": ");
                notas[aluno][avaliacao] = entrada.nextDouble();
            }
            entrada.nextLine();
        }

        System.out.println("=== RESULTADOS ===");
        double somaGeral = 0;

        for (int aluno = 0; aluno < 4; aluno++) {
            System.out.println("Aluno: " + nomes[aluno]);
            double somaNotas = 0;
            for (int avaliacao = 0; avaliacao < 3; avaliacao++) {
                System.out.println("  Nota " + (avaliacao + 1) + ": " + notas[aluno][avaliacao]);
                somaNotas += notas[aluno][avaliacao];
            }
            double mediaAluno = somaNotas / 3;
            System.out.println("  Média: " + mediaAluno);
            if (mediaAluno >= 6.0) {
                System.out.println("  Situação: Aprovado");
            } else {
                System.out.println("  Situação: Reprovado");
            }
            somaGeral += mediaAluno;
        }
        double mediaGeral = somaGeral / 4;
        System.out.println("Média geral da turma: " + mediaGeral);
    }
}
