package Atividade07;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] gastos = new double[7];
        double total = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Informe o gasto do " + (i + 1) + "º dia: ");
            gastos[i] = entrada.nextDouble();
            total += gastos[i];
        }
        double media = total / 7;

        System.out.println("=== RESULTADOS ===");

        for (int i = 0; i < 7; i++) {
            System.out.println("Gasto do " + (i + 1) + "º dia: " + gastos[i]);
        }
        System.out.println("Total gasto na semana: " + total);
        System.out.println("Média semanal: " + media);

        double maiorGasto = gastos[0];
        int diaMaiorGasto = 0;

        for (int i = 1; i < 7; i++) {
            if (gastos[i] > maiorGasto) {
                maiorGasto = gastos[i];
                diaMaiorGasto = i;
            }
        }
        System.out.println("Maior gasto foi no dia " + (diaMaiorGasto + 1) + " no valor de: " + maiorGasto);
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < 7; i++) {
            if (gastos[i] > media) {
                diasAcimaDaMedia++;
            }
        }
        System.out.println("Dias com gasto acima da média: " + diasAcimaDaMedia);
    }
}
