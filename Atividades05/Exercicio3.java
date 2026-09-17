package Atividades05;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] produtos = new int[8];
        for(int i=0; i<8; i++){
            System.out.println("Informe a quantidade do produto "+ (i+1)+ ": ");
            produtos[i] = entrada.nextInt();
        }
        int maior = produtos[0];
        int menor = produtos[0];
        int poucoEstoque = 0;

        for (int i = 0; i < 8; i++) {
            if (produtos[i] > maior) {
                maior = produtos[i];
            }
            if (produtos[i] < menor) {
                menor = produtos[i];
            }
            if (produtos[i] < 5) {
                poucoEstoque++;
            }
        }
        System.out.println("Maior quantidade encontrada: " + maior);
        System.out.println("Menor quantidade encontrada: " + menor);
        System.out.println("Quantidade de produtos com menos de 5 unidades: " + poucoEstoque);
    }
}