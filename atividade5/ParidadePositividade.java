package atividade5;

import java.util.Scanner;

public class ParidadePositividade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        
        if (numero % 2 == 0) {
            System.out.print("Par");
        } else {
            System.out.print("Impar");
        }

        if (numero > 0) {
            System.out.println(" e positivo.");
        } else if (numero < 0) {
            System.out.println(" e negativo.");
        } else {
            System.out.println(" e é zero.");
        }

        sc.close();
    }


	}


