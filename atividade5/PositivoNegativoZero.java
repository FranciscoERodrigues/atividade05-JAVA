package atividade5;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0)
            System.out.println("positivo");
        else if (numero < 0)
            System.out.println("negativo");
        else
            System.out.println("Zero");

        sc.close();
    }
}