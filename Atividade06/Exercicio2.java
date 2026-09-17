import java.util.Scanner;
public class Exercicio2 {

    public static void mostrarCabecalho() {
        System.out.println("Sistema de Controle de Vendas Semanais");
        System.out.println("======================================");
    }

    public static void preencherVendas(int[] vendas, Scanner entrada) {
        for (int i = 0; i< 7; i++) {
            System.out.println("Informe a quantidade vendida no dia " + (i + 1)+ ": ");
            vendas[i] = entrada.nextInt();
        }
    }
    public static int calcularTotal(int[] vendas) {
        int total = 0;
        for (int i =0; i < 7; i++) {
            total += vendas[i];
        }
        return total;
    }
    public static int encontrarMaiorVenda(int[] vendas) {
        int maior = vendas[0];
        for (int i = 1; i< 7; i++) {
            if (vendas[i] > maior) {
                maior = vendas[i];
            }
        }
        return maior;
    }
    public static int contarDiasMetaAtingida(int[] vendas, int meta) {
        int dias = 0;
        for (int i= 0; i <7; i++) {
            if (vendas[i] >= meta) {
                dias++;
            }
        }
        return dias;
    }
    public static void mostrarVendas(int[] vendas) {
        for (int i = 0; i < 7; i++) {
            System.out.println("Vendas do dia " + (i + 1) + ": " + vendas[i]);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vendas = new int[7];
        int meta = 20;

        mostrarCabecalho();
        preencherVendas(vendas, entrada);

        int total = calcularTotal(vendas);
        double mediaDiaria = (double) total / 7;
        int maiorVenda = encontrarMaiorVenda(vendas);
        int diasMetaAtingida = contarDiasMetaAtingida(vendas, meta);

        mostrarVendas(vendas);
        System.out.println("Total de produtos vendidos na semana: "+ total);
        System.out.println("Média diaria de vendas: "+ mediaDiaria);
        System.out.println("Maior quantidade vendida em um dia: "+ maiorVenda);
        System.out.println("Quantidade de dias em que a meta foi atingida: "+ diasMetaAtingida);
    }
}