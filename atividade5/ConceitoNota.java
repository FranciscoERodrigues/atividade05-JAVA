package atividade5;
import java.util.Scanner;


public class ConceitoNota {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite sua nota (0 a 100): ");
		        int nota = sc.nextInt();

		        if (nota >= 90)
		            System.out.println("Conceito A");
		        else if (nota >= 80)
		            System.out.println("Conceito B");
		        else if (nota >= 70)
		            System.out.println("Conceito C");
		        else if (nota >= 60)
		            System.out.println("Conceito D");
		        else
		            System.out.println("Conceito F");

		        sc.close();
		    }
		

	}


