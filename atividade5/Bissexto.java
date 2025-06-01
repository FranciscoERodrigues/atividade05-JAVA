package atividade5;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {

		
			        Scanner sc = new Scanner(System.in);

			        System.out.print("Digite um ano: ");
			        int ano = sc.nextInt();

			        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			            System.out.println("é um ano bissexto !!!");
			        }else {
			            System.out.println("Esse ano NÃO é bissexto.");
			           
			        }
			        sc.close();
			    }
			
	}


