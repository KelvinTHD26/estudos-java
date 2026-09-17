package Atividade07;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] jogadores = new String[3];
        int[][] gols = new int[3][2];

        for (int jogador = 0; jogador < 3; jogador++) {
            System.out.println("Informe o nome do " + (jogador + 1) + "º jogador: ");
            jogadores[jogador] = entrada.nextLine();
            for (int partida = 0; partida < 2; partida++) {
                System.out.println("Gols de " + jogadores[jogador] + " na partida " + (partida + 1) + ": ");
                gols[jogador][partida] = entrada.nextInt();
            }
            entrada.nextLine();
        }

        System.out.println("=== RESULTADOS ===");

        int maiorTotalGols = 0;
        String artilheiro = "";

        for (int jogador = 0; jogador < 3; jogador++) {
            int totalGolsJogador = 0;

            for (int partida = 0; partida < 2; partida++) {
                totalGolsJogador += gols[jogador][partida];
            }

            double mediaGols = calcularMedia(totalGolsJogador, 2);

            System.out.println("Jogador: " + jogadores[jogador]);
            System.out.println("  Total de gols: " + totalGolsJogador);
            System.out.println("  Média de gols por partida: " + mediaGols);

            if (totalGolsJogador > maiorTotalGols) {
                maiorTotalGols = totalGolsJogador;
                artilheiro = jogadores[jogador];
            }
        }
        System.out.println("Artilheiro do time: " + artilheiro + ", com " + maiorTotalGols + " gols");
    }
    public static double calcularMedia(int totalGols, int quantidadePartidas) {
        return (double) totalGols / quantidadePartidas;
    }
}
