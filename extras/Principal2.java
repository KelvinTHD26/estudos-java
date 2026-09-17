import java.util.Scanner;

public class Principal2 {
    // Algoritmo 1: Verifica se um número é divisível por 2, 3 e 5
    public static void verificaDivisibilidade(int n) {
        boolean div2 = (n % 2 == 0);
        boolean div3 = (n % 3 == 0);
        boolean div5 = (n % 5 == 0);
        System.out.println("Divisível por 2: " + div2);
        System.out.println("Divisível por 3: " + div3);
        System.out.println("Divisível por 5: " + div5);
    }

    // Algoritmo 2: Calcula a divisão inteira (div) e o resto (mod) entre a e b
    public static void divMod(int a, int b) {
        int divisao = a / b; // divisão inteira
        int resto = a % b;   // resto da divisão
        System.out.println(a + " div " + b + " = " + divisao);
        System.out.println(a + " mod " + b + " = " + resto);
    }

    // Algoritmo 3: Verifica se um número é par ou ímpar usando apenas mod
    public static void parOuImpar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " é par");
        } else {
            System.out.println(n + " é ímpar");
        }
    }

    // Algoritmo 4: Determina se um número n é múltiplo de 7
    public static void multiploDeSete(int n) {
        boolean multiplo = (n % 7 == 0);
        System.out.println(n + " é múltiplo de 7: " + multiplo);
    }

    // Algoritmo 5: Calcula o resto da divisão de um número por 10
    public static void restoPorDez(int n) {
        int resto = n % 10;
        System.out.println("Resto de " + n + " dividido por 10: " + resto);
    }

    // Algoritmo 6: Verifica se um número é divisível por 3 e não divisível por 5
    public static void divisivelPor3NaoPor5(int n) {
        boolean resultado = (n % 3 == 0) && (n % 5 != 0);
        System.out.println(n + " é divisível por 3 e não por 5: " + resultado);
    }

    // Algoritmo 7: Verifica se n ≡ 1 (mod 4)
    public static void congruenteUmMod4(int n) {
        boolean resultado = (n % 4 == 1);
        System.out.println(n + " ≡ 1 (mod 4): " + resultado);
    }

    // Algoritmo 8: Classifica um número quanto à divisibilidade por 2 e 3
    public static void classificaNumero(int n) {
        boolean div2 = (n % 2 == 0);
        boolean div3 = (n % 3 == 0);
        if (div2 && div3) {
            System.out.println(n + " é divisível por 2 e 3");
        } else if (div2) {
            System.out.println(n + " é divisível apenas por 2");
        } else if (div3) {
            System.out.println(n + " é divisível apenas por 3");
        } else {
            System.out.println(n + " não é divisível por 2 nem por 3");
        }
    }

    // Programa principal: lê os dados e chama cada algoritmo em etapas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro (n):");
        int n = scanner.nextInt();
        System.out.println("Digite um segundo número (b), usado no algoritmo de div/mod:");
        int b = scanner.nextInt();
        System.out.println("--- Algoritmo 1: Divisibilidade por 2, 3 e 5 ---");
        verificaDivisibilidade(n);
        System.out.println("--- Algoritmo 2: Divisão inteira (div) e resto (mod) ---");
        divMod(n, b);
        System.out.println("--- Algoritmo 3: Par ou ímpar (usando mod) ---");
        parOuImpar(n);
        System.out.println("--- Algoritmo 4: Múltiplo de 7 ---");
        multiploDeSete(n);
        System.out.println("--- Algoritmo 5: Resto da divisão por 10 ---");
        restoPorDez(n);
        System.out.println("--- Algoritmo 6: Divisível por 3 e não por 5 ---");
        divisivelPor3NaoPor5(n);
        System.out.println("--- Algoritmo 7: Congruência n ≡ 1 (mod 4) ---");
        congruenteUmMod4(n);
        System.out.println("--- Algoritmo 8: Classificação por divisibilidade (2 e/ou 3) ---");
        classificaNumero(n);

        scanner.close();
    }
}
