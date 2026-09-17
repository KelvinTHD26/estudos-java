package Atividade07;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = converterFahrenheit(celsius);
        double kelvin = converterKelvin(celsius);
        System.out.println("=== RESULTADOS ===");
        System.out.println(celsius + "°C em Fahrenheit é: " + fahrenheit + "°F");
        System.out.println(celsius + "°C em Kelvin é: " + kelvin + "K");
    }
    public static double converterFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    public static double converterKelvin(double celsius) {
        return celsius + 273.15;
    }
}
