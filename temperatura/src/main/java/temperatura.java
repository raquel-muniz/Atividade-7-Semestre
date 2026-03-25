/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

import java.util.Scanner;

public class Temperatura {
 // convert the temperature from Celsius to Fahrenheit
    public static void main(String[] args) {
        double C; // temperatura em Celsius
        double F; // temperatura em Fahrenheit
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Faça a conversão de Celsius para Fahrenheit. ");
            System.out.println("Temperatura em Celcius (°C): ");
            C = scanner.nextDouble();
            
            F = ((9 * C) + 160) / 5;
            
            System.out.println("\n" + C + " °C\n" + F + " °F");
        }
    }
}

