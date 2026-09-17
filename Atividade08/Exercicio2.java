package Atividade08;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] vendas = new int[3][4];

        for (int vendedor = 0; vendedor < 3; vendedor++) {
            for (int semana = 0; semana < 4; semana++) {
                System.out.println("Informe as vendas do vendedor " + (vendedor + 1) + " na semana " + (semana + 1) + ": ");
                vendas[vendedor][semana] = entrada.nextInt();
            }
        }
        System.out.println("=== RESULTADOS ===");
        for (int vendedor = 0; vendedor < 3; vendedor++) {
            System.out.println("Vendedor " + (vendedor + 1) + ":");
            for (int semana = 0; semana < 4; semana++) {
                System.out.println("  Semana " + (semana + 1) + ": " + vendas[vendedor][semana]);
            }
        }

        int totalGeral = 0;
        for (int vendedor = 0; vendedor < 3; vendedor++) {
            int totalVendedor = 0;
            for (int semana = 0; semana < 4; semana++) {
                totalVendedor += vendas[vendedor][semana];
            }
            System.out.println("Total vendido pelo vendedor " + (vendedor + 1) + ": " + totalVendedor);
            totalGeral += totalVendedor;
        }
        System.out.println("Total geral de vendas da empresa: " + totalGeral);
    }
}
