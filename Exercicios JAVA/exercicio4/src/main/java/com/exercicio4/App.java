package com.exercicio4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double c, f;
        System.out.println("Digite a quantidade de Cemtígrados");
        c = scanner.nextDouble();
        f = (9*c + 160) / 5;
        System.out.println("O valor em Fahrenheit é: " + f);
    }
}
