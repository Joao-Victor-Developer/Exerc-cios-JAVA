package com.exercicio5;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double alt, raio, r, volume;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o valor da altura: ");
        alt = scanner.nextDouble();
        System.out.println("Digite o valor do raio: ");
        raio = scanner.nextDouble();
        r = raio * raio;
        volume = 3.14159 * r * alt;
        System.out.printf("\n O valor do volume é = %f \n", volume);
    }
}
