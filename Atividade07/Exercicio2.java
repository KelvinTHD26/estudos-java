package Atividade07;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] presencas = new int[4][3];

        for (int aluno = 0; aluno < 4; aluno++) {
            for (int aula = 0; aula < 3; aula++) {
                System.out.println("Aluno " + (aluno + 1) + " esteve presente na aula " + (aula + 1) + "? (1-Sim / 0-Não): ");
                presencas[aluno][aula] = entrada.nextInt();
            }
        }
        System.out.println("=== RESULTADOS ===");

        for (int aluno = 0; aluno < 4; aluno++) {
            System.out.println("Aluno " + (aluno + 1) + ":");
            for (int aula = 0; aula < 3; aula++) {
                System.out.println("  Aula " + (aula + 1) + ": " + presencas[aluno][aula]);
            }
        }
        int totalGeral = 0;

        for (int aluno = 0; aluno < 4; aluno++) {
            int totalPresencasAluno = 0;
            for (int aula = 0; aula < 3; aula++) {
                if (presencas[aluno][aula] == 1) {
                    totalPresencasAluno++;
                }
            }
            System.out.println("Aluno " + (aluno + 1) + " frequentou " + totalPresencasAluno + " aula(s)");
            totalGeral += totalPresencasAluno;
        }
        System.out.println("Total geral de presenças na turma: " + totalGeral);
    }
}
