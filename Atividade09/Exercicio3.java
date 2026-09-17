package Atividade09;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        System.out.print("Digite a palavra que deseja procurar: ");
        String palavra = entrada.nextLine();
        String fraseMinuscula = frase.toLowerCase();
        String palavraMinuscula = palavra.toLowerCase();

        if (fraseMinuscula.contains(palavraMinuscula)) {
            System.out.println("--- RESULTADOS ---");
            System.out.println("A palavra " + palavra + " foi encontrada na frase!");
            System.out.println("Primeira ocorrência na posição: " + fraseMinuscula.indexOf(palavraMinuscula));
            System.out.println("Última ocorrência na posição: " + fraseMinuscula.lastIndexOf(palavraMinuscula));
        } else {
            System.out.println("A palavra " + palavra + " não foi encontrada na frase.");
        }
    }
}
