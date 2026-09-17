package Atividade10;
import java.util.Scanner;
public class Exercicio1 {
    static Scanner entrada = new Scanner(System.in);
    static String[] nomes = new String[5];
    static int[] quantidades = new int[5];
    static int totalProdutos = 0;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Procurar produto");
            System.out.println("4 - Alterar quantidade");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Apresentar total do estoque");
            System.out.println("7 - Apresentar produto com maior estoque");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    procurarProduto();
                    break;
                case 4:
                    alterarQuantidade();
                    break;
                case 5:
                    removerProduto();
                    break;
                case 6:
                    apresentarTotalEstoque();
                    break;
                case 7:
                    apresentarMaiorEstoque();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    public static void cadastrarProduto() {
        if (totalProdutos < 5) {
            System.out.print("Nome do produto: ");
            String nome = entrada.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = entrada.nextInt();
            entrada.nextLine();

            nomes[totalProdutos] = nome;
            quantidades[totalProdutos] = quantidade;
            totalProdutos++;

            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Estoque cheio! Não é possível cadastrar mais produtos.");
        }
    }
    public static void listarProdutos() {
        if (totalProdutos == 0) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("--- PRODUTOS CADASTRADOS ---");
            for (int i = 0; i < totalProdutos; i++) {
                System.out.println((i + 1) + " - " + nomes[i] + " | Quantidade: " + quantidades[i]);
            }
        }
    }

    public static int buscarPosicaoPorNome(String nomeProcurado) {
        for (int i = 0; i < totalProdutos; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                return i;
            }
        }
        return -1;
    }
    public static void procurarProduto() {
        System.out.print("Informe o nome do produto: ");
        String nomeProcurado = entrada.nextLine();

        int posicao = buscarPosicaoPorNome(nomeProcurado);

        if (posicao != -1) {
            System.out.println("Produto encontrado: " + nomes[posicao] + " | Quantidade: " + quantidades[posicao]);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    public static void alterarQuantidade() {
        System.out.print("Informe o nome do produto: ");
        String nomeProcurado = entrada.nextLine();

        int posicao = buscarPosicaoPorNome(nomeProcurado);

        if (posicao != -1) {
            System.out.print("Informe a nova quantidade: ");
            int novaQuantidade = entrada.nextInt();
            entrada.nextLine();

            quantidades[posicao] = novaQuantidade;
            System.out.println("Quantidade alterada com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    public static void removerProduto() {
        System.out.print("Informe o nome do produto: ");
        String nomeProcurado = entrada.nextLine();

        int posicao = buscarPosicaoPorNome(nomeProcurado);

        if (posicao != -1) {
            for (int i = posicao; i < totalProdutos - 1; i++) {
                nomes[i] = nomes[i + 1];
                quantidades[i] = quantidades[i + 1];
            }
            totalProdutos--;
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    public static void apresentarTotalEstoque() {
        int total = 0;
        for (int i = 0; i < totalProdutos; i++) {
            total += quantidades[i];
        }
        System.out.println("Quantidade total de itens no estoque: " + total);
    }
    public static void apresentarMaiorEstoque() {
        if (totalProdutos == 0) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            int maiorQuantidade = quantidades[0];
            int posicaoMaior = 0;

            for (int i = 1; i < totalProdutos; i++) {
                if (quantidades[i] > maiorQuantidade) {
                    maiorQuantidade = quantidades[i];
                    posicaoMaior = i;
                }
            }
            System.out.println("Produto com maior estoque: " + nomes[posicaoMaior] + " | Quantidade: " + maiorQuantidade);
        }
    }
}