package Atividades05;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        double[] temperatura = new double[7];
        for(int i=0; i<7; i++){
            System.out.println("Diga a temperatuda do dia "+ (i+1) +": ");
            temperatura[i] = entrada.nextDouble();
            soma += temperatura[i];
        }
        System.out.println("===Todas as temperaturas===");
        for(int i=0; i<7; i++){
            System.out.println(temperatura[i]);
        }
        System.out.println("Soma de todas: "+ soma);
        media(soma);
    }
    public static void media(double soma){
        double m = soma / 7;
        System.out.println("Media: "+ m);
    }
}

