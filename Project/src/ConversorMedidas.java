package src;

import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer desde consola
        Scanner scanner = new Scanner(System.in);

        // Conversión de metros a centímetros
        System.out.print("Ingrese la cantidad de metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100; // 1 metro = 100 centímetros
        System.out.println(metros + " metros son " + centimetros + " centímetros.");

        // Conversión de kilogramos a libras
        System.out.print("Ingrese el peso en kilogramos: ");
        double kilogramos = scanner.nextDouble();
        double libras = kilogramos * 2.20462; // 1 kg ≈ 2.20462 libras
        System.out.println(kilogramos + " kg son " + libras + " libras.");

        // Conversión de grados Celsius a Fahrenheit
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32; // Fórmula de conversión
        System.out.println(celsius + " °C son " + fahrenheit + " °F.");

        // Cerramos el escáner
        scanner.close();
    }
}
