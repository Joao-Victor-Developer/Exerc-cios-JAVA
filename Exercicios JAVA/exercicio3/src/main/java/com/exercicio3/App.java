package com.exercicio3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner joans = new Scanner (System.in);
        float n1, n2, som, med;
        System.out.println("Digite o primeiro número: ");
        n1 = joans.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = joans.nextFloat();
        som = n1 + n2;
        med = som / 2;
        System.out.printf("\n A média entre os dois números é: = %f \n", med);
    }
}
