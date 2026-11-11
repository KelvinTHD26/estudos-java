package Atividade12;
import java.util.Scanner;
public class Exercicio1 {
    static Scanner entrada = new Scanner(System.in);

    static String[] nomes = new String[5];
    static double[] notas = new double[5];

    public static void main(String[] args) {

        cadastrarAluno();
        apresentarAlunos();

        double media = calcularMedia();
        double maior = encontrarMaior();
        double menor = encontrarMenor();

        System.out.println("=== Resultados ===");
        System.out.println("Média da Turma :"+ media);
        System.out.println("Maior nota:"+ maior);
        System.out.println("Menor nota:"+ menor);

        System.out.println("==== Situação de Cada Aluno ====");
            for (int i = 0; i < 5; i++) {
                apresentarSituacao(nomes[i], notas[i]);
            }

        System.out.println("Informe o Aluno para Buscar: ");
        String nomeProcurado = entrada.nextLine();
        int posicao = buscarAluno(nomeProcurado);

        if(posicao != -1){
            System.out.println("Aluno encontrado na posição "  + (posicao + 1) + ": " + nomes[posicao] + " - Nota: " + notas[posicao]);
        } else {
            System.out.println("Aluno não encontrado");
        }
        entrada.close();
    }
    public static void cadastrarAluno() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do aluno " + (i+1) + ": ");
            nomes[i] = entrada.nextLine();

            System.out.println("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = entrada.nextDouble();
            entrada.nextLine();
        }
    }
    public static void apresentarAlunos() {
        System.out.println("=== Todos os alunos ====");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " " + notas[i]);
        }
    }
    public static double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        return soma / 5;
        }

        public static double encontrarMaior() {
            double maior = notas[0];
            for (int i = 0; i < 5; i++) {
                if (notas[i] > maior) {
                    maior = notas[i];
                }
            }
            return maior;
        }
        public static double encontrarMenor() {
            double menor = notas[0];
            for (int i = 0; i < 5; i++) {
                if (notas[i] < menor) {
                    menor = notas[i];
                }
            }
            return menor;
        }
        public static int buscarAluno(String nomeProcurado) {
            for (int i = 0; i < 5; i++) {
                if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                    return i;
                }
            }
            return -1;
        }
        public static void apresentarSituacao(String nome, double nota) {
            String situacao;

            if(nota >=  6.0) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            System.out.println(nome + " - Nota: " + nota + " - Situação: " + situacao);
        }
}

