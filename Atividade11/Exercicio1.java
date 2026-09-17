package Atividade11;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite um valor da posição [" + (l+1) + "][" + (c+1) + "]: ");
                matriz[l][c] = entrada.nextInt();
            }
        }
        System.out.println("=== Matriz ===");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int somatotal = 0;
        int somadiagonal = 0;

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
                if (matriz[l][c] < menor) {
                    menor = matriz[l][c];
                }
                somatotal += matriz[l][c];
                if (l==c) {
                    somadiagonal += matriz[l][c];
                }
            }
        }
        System.out.println("=== Resultado ===");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma Total: " + somatotal);
        System.out.println("Soma Diagonal Principal: " + somadiagonal);
        entrada.close();
    }
}
