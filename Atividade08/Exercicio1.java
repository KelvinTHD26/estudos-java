package Atividade08;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] consumo = new double[6];
        double total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o consumo do " + (i + 1) + "º mês (kWh): ");
            consumo[i] = entrada.nextDouble();
            total += consumo[i];
        }

        double media = total / 6;
        System.out.println("=== RESULTADOS ===");
        for (int i = 0; i < 6; i++) {
            System.out.println("Consumo do " + (i + 1) + "º mês: " + consumo[i]);
        }
        System.out.println("Consumo total: " + total);
        System.out.println("Média mensal: " + media);
        double maiorConsumo = consumo[0];
        for (int i = 1; i < 6; i++) {
            if (consumo[i] > maiorConsumo) {
                maiorConsumo = consumo[i];
            }
        }
        System.out.println("Maior consumo: " + maiorConsumo);
        int mesesAcimaDaMedia = 0;
        for (int i = 0; i < 6; i++) {
            if (consumo[i] > media) {
                mesesAcimaDaMedia++;
            }
        }
        System.out.println("Meses com consumo acima da média: " + mesesAcimaDaMedia);
    }
}
