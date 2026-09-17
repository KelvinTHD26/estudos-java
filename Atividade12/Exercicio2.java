package Atividade12;
import java.util.Scanner;
public class Exercicio2 {
    static Scanner entrada = new Scanner(System.in);
    static int[][] vendas = new int[3][4];
    public static void main(String[] args) {
        prencherMatriz();
        apresentarMatriz();

        int TotalGeral = somarVendas();
        int MaiorVenda = MaiorVenda();
        int MenorVenda = MenorVenda();

        System.out.println("=== Resultado ===");
        System.out.println("Total de vendas Registradas: " + TotalGeral);
        System.out.println("Maior venda: " + MaiorVenda);
        System.out.println("Menor venda: " + MenorVenda);

        System.out.println("=== Vendas Por Vendedor ===");
        for (int i = 0; i<3; i++){
            System.out.println("Vendedor " + (i+1)+ ": " + somaLinha(i));
        }
        System.out.println("=== Vendas Por Semana ===");
        for (int j = 0; j<4; j++){
            System.out.println("Semana " + (j+1)+ ": " + somaColuna(j));
        }
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal());
        entrada.close();
    }
    public static void prencherMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe a vendas do vendedor " + (i+1) + " na semana " + (j+1)+ ": ");
                vendas[i][j] = entrada.nextInt();
            }
        }
    }
    public static void apresentarMatriz() {
        System.out.println("=== Matriz De Vendas ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(vendas[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int somarVendas() {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                soma += vendas[i][j];
            }
        }
        return soma;
    }
    public static int MaiorVenda() {
        int maior = vendas[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (vendas[i][j] > maior) {
                    maior = vendas[i][j];
                }
            }
        }
        return maior;
    }
    public static int MenorVenda() {
        int menor = vendas[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (vendas[i][j] < menor) {
                    menor = vendas[i][j];
                }
            }
        }
        return menor;
    }
    public static int somaLinha(int linha) {
        int soma = 0;
        for (int j = 0; j < 4; j++) {
            soma += vendas[linha][j];
        }
        return soma;
    }
    public static int somaColuna(int coluna) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += vendas[i][coluna];
        }
        return soma;
    }
    public static int somaDiagonalPrincipal(){
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += vendas[i][i];
        }
        return soma;
    }
}
