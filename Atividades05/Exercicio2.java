package Atividades05;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] Aluno = new String[5];

        for(int i=0; i<5; i++){
            System.out.println("Informe o nome do "+ (i+1)+ "° aluno ");
            Aluno[i] = entrada.nextLine();
        }
        for(int i=0; i<5; i++){
            System.out.println("Aluno "+ (i+1)+": "+ Aluno[i]);
        }
    }
}
