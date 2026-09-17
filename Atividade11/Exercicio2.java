package Atividade11;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int l = 0; l < 4; l++) {
            for (int c= 0; c < 4; c++) {
                System.out.println("Digite um valor da posição [" + (l+1) + "][" + (c+1) + "]: ");
                matriz[l][c] = entrada.nextInt();
            }
        }

        System.out.println("=== Matriz ===");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int somaDiagogal = 0;

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
                if (matriz[l][c] < menor) {
                    menor = matriz[l][c];
                }
                if (l == c){
                    somaDiagogal += matriz[l][c];
                }
            }
        }
        System.out.println("=== Soma Por Linha ===");
        for (int l = 0; l < 4; l++) {
            int somalinha = 0;
            for (int c = 0; c < 4; c++) {
                somalinha += matriz[l][c];
            }
            System.out.println("Soma Da linha " + (l+1) + ": " + somalinha);
        }
        System.out.println("=== Soma Por Coluna ===");
        for (int c = 0; c < 4; c++) {
            int somacoluna = 0;
            for (int l = 0; l < 4; l++) {
                somacoluna += matriz[l][c];
            }
            System.out.println("Soma Da coluna " + (c+1) + ": " + somacoluna);
        }
        System.out.println("=== Resultados ===");
        System.out.println("Maior Valor: " + maior);
        System.out.println("Menor Valor: " + menor);
        System.out.println("Soma da Diagonal Principal: " + somaDiagogal);

        entrada.close();
    }
}
