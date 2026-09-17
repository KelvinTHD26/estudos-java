package Atividade09;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        nome = nome.trim();

        if (!nome.isEmpty()) {
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Nome sem espaços nas extremidades: '" + nome + "'");
            System.out.println("Nome em maiusculas: " + nome.toUpperCase());
            System.out.println("Quantidade de caracteres: " + nome.length());
            if (nome.contains(" ")) {
                System.out.println("O nome possui espaço entre as palavras");
                System.out.println("Você digitou um nome completo");
            } else {
                System.out.println("O nome não possui espaço entre as palavras");
                System.out.println("Você digitou apenas um nome");
            }
        } else {
            System.out.println("Você não informou nenhum nome");
        }
    }
}
