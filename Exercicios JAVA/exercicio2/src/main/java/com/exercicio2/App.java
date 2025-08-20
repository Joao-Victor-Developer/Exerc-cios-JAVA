package com.exercicio2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double sal, qtd; 
        float min_sal;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o seu salário");
        sal = scanner.nextDouble();
        min_sal = 1518.00f;
        qtd = sal / (double)min_sal;
        System.out.printf("\n A quantidade de salários mínimos dentro do seu salário é = %f \n", qtd);
    }
}
