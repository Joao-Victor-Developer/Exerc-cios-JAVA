package com.exercicio;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        float v1, resultadofinal;                   
        String p; 
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        p = input.next();

        System.out.println("Digite o valor do produto: ");
        v1 = input.nextFloat();

        resultadofinal = v1 * 0.9f;

        System.out.printf("\nCom desconto = %.2f\n", resultadofinal);
        System.out.println("O produto é: " + p);
        System.out.printf("\nValor original = %.2f\n", v1);
    }
}
