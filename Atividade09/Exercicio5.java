package Atividade09;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        nome = nome.trim();

        if (!nome.isEmpty()) {
            if (nome.contains(" ")) {
                String[] palavras = nome.split(" ");
                String primeiroNome = palavras[0];
                String ultimoSobrenome = palavras[palavras.length - 1];
                String nomeUsuario = primeiroNome.toLowerCase() + "." + ultimoSobrenome.toLowerCase();

                System.out.println("=== RESULTADOS ===");
                System.out.println("Nome de usuario gerado: " + nomeUsuario);
            } else {
                System.out.println("Você precisa informar pelo menos um nome e um sobrenome.");
            }
        } else {
            System.out.println("Você não informou nenhum nome.");
        }

    }
}
