package Atividade12;
import java.util.Scanner;
public class Principal1 {
    static Scanner entrada = new Scanner(System.in);

    static String[] nomes = new String[5];
    static double[] notas = new double[5];

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CadastrarAluno();
        apresentarAlunos();

        double media = CalcularMedia();
        double Maior = encontrarMaior();
        double Menor = encontrarMenor();

        System.out.println("=== Resultados ===");
        System.out.println("Media da Turma :"+ media);
        System.out.println("Maior nota :"+ Maior);
        System.out.println("Menor nota :"+ Menor);

        System.out.println("==== Situação De Cada Aluno ====");
            for (int i = 0; i < 5; i++) {
                ApresentarSituacao(nomes[i], notas[i]);
            }

        System.out.println("Informe o Aluno para Buscar: ");
        String nomeProcurado = entrada.nextLine();
        int posicao = BuscarAluno(nomeProcurado);

        if(posicao != -1){
            System.out.println("Aluno encontrado na posição "  + (posicao + 1) + ": " + nomes[posicao] + " - Nota: " + notas[posicao]);
        } else {
            System.out.println("Aluno não encontrado");
        }
        entrada.close();
    }
    public static void CadastrarAluno() {
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
    public static double CalcularMedia() {
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
        public static int BuscarAluno(String nomeProcurado) {
            for (int i = 0; i < 5; i++) {
                if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                    return i;
                }
            }
            return -1;
        }
        public static void ApresentarSituacao(String nome, double nota) {
            String situacao;

            if(nota >=  6.0) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            System.out.println(nome + " - Nota: " + nota + " - Situação: " + situacao);
        }
}

