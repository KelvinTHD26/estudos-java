import java.util.Scanner;
public class Principal {
    static Scanner entrada = new Scanner(System.in);
    static String[] projetos = new String[4];
    static double[][] notas = new double[4][3];

    public static void main(String[] args) {
        mostrarCabecalho();
        cadastrarProjetos();
        cadastrarNotas();
        apresentarMatriz();

        System.out.println("=== RESULTADOS ===");
        for (int i = 0; i < 4; i++) {
            double media = calcularMedia(i);
            String classificacao = classificarProjeto(media);
            apresentarProjeto(projetos[i],media, classificacao);
        }

        System.out.print("Digite uma palavra para pesquisar nos nomes dos projetos: ");
        String palavra = entrada.nextLine();

        System.out.println("Projetos que contem a palavra " + palavra + ":");
        boolean encontrouAlgo = false;
        for (int i = 0; i < 4; i++) {
            if (projetos[i].toLowerCase().contains(palavra.toLowerCase())) {
                System.out.println(" - " + projetos[i]);
                encontrouAlgo = true;
            }
        }
        if (!encontrouAlgo) {
            System.out.println("Nenhum projeto encontrado com essa palavra.");
        }
        int posicaoVencedor = encontrarVencedor();
        double mediaVencedor = calcularMedia(posicaoVencedor);

        System.out.println("=== PROJETO VENCEDOR!! ===");
        System.out.println("Projeto: " + projetos[posicaoVencedor]);
        System.out.println("Media: " + mediaVencedor);
        System.out.println("Parabens!!!!!");

        entrada.close();
    }
    public static void mostrarCabecalho() {
        System.out.println("=== MOSTRA ESCOLAR DE PROJETOS DIGITAIS ===");
    }
    public static void cadastrarProjetos() {
        for (int i = 0; i < 4; i++) {
            String nome = "";
            boolean nomeValido = false;
            while (!nomeValido) {
                System.out.print("Digite o nome do " +(i + 1)+ "º projeto: ");
                nome = entrada.nextLine().trim();

                if (nome.isEmpty()) {
                    System.out.println("O nome não pode estar vazio! Tente novamente ");
                } else {
                    nomeValido = true;
                }
            }
            projetos[i] = nome;
        }
    }
    public static void cadastrarNotas() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe a nota do jurado " + (j + 1) + " para o projeto " + projetos[i] + ": ");
                double nota = entrada.nextDouble();
                while (nota < 0 || nota > 10) {
                    System.out.print("Nota invalida! Informe um valor entre 0 e 10: ");
                    nota = entrada.nextDouble();
                }
                notas[i][j] = nota;
            }
        }
        entrada.nextLine();
    }
    public static double calcularMedia(int linha) {
        double soma = 0;
        for (int j = 0; j < 3; j++) {
            soma += notas[linha][j];
        }
        return soma / 3;
    }
    public static int encontrarVencedor() {
        int posicaoVencedor= 0;
        double maiorMedia = calcularMedia(0);
        for (int i = 1; i < 4; i++) {
            double mediaAtual = calcularMedia(i);
            if (mediaAtual > maiorMedia) {
                maiorMedia = mediaAtual;
                posicaoVencedor = i;
            }
        }
        return posicaoVencedor;
    }
    public static int buscarProjeto(String nomeProcurado) {
        for (int i = 0; i < 4; i++) {
            if (projetos[i].equalsIgnoreCase(nomeProcurado)) {
                return i;
            }
        }
        return -1;
    }
    public static String classificarProjeto(double media) {
        if (media >= 8) {
            return "Destaque";
        } else if (media >= 6) {
            return "Bom";
        } else {
            return "Precisa melhorar";
        }
    }
    public static void apresentarProjeto(String nome, double media, String classificacao) {
        System.out.println("Projeto: " + nome.toUpperCase());
        System.out.println("Quantidade de caracteres: " + nome.length());
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Classificação: " + classificacao);
    }
    public static void apresentarMatriz() {
        System.out.println("--- TABELA DE NOTAS ---");
        for (int i = 0; i < 4; i++) {
            System.out.print(projetos[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notas[i][j] + "  ");
            }
            System.out.println();
        }
    }
}