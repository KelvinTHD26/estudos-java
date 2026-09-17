import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Informe a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            default:
                operacaoValida = false;
                System.out.println("Operação inválida!");
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        entrada.close();
    }
}
