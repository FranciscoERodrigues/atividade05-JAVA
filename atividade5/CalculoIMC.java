package atividade5;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        float peso = sc.nextFloat();
        System.out.print("Digite sua altura (m): ");
        float altura = sc.nextFloat();

        double imc = (altura * altura)/peso;
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5)
            System.out.println("Classificação: Abaixo do peso.");
        else if (imc < 25)
            System.out.println("Classificação: Peso normal.");
        else if (imc < 30)
            System.out.println("Classificação: Sobrepeso.");
        else if (imc < 35)
            System.out.println("Classificação: Obesidade grau I.");
        else if (imc < 40)
            System.out.println("Classificação: Obesidade grau II.");
        else
            System.out.println("Classificação: Obesidade grau III (mórbida).");

        sc.close();
    }
}