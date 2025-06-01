package atividade5;

import java.util.Scanner;

public class TipoTriangulo{
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);

	        
	        System.out.print("Digite o primeiro lado do triângulo: ");
	        double lado1 =sc.nextDouble();

	        System.out.print("Digite o segundo lado do triângulo: ");
	        double lado2 = sc.nextDouble();

	        System.out.print("Digite o terceiro lado do triângulo: ");
	        double lado3 = sc.nextDouble();

	      
	        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            if (lado1 == lado2 && lado2 == lado3) {
	                System.out.println("Triângulo Equilátero.");
	            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	                System.out.println("Triângulo Isósceles.");
	            } else {
	                System.out.println("Triângulo Escaleno.");
	            }
	        } else {
	            System.out.println("Os valores informados não formam um triângulo válido.");
	        }

	        sc.close();
	    }
	}