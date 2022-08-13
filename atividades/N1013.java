package atividades;

import java.util.Scanner;

public class N1013 {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] numeros = scanner.nextLine().split(" ");
		
		double A = Double.parseDouble(numeros[0]);
		double B = Double.parseDouble(numeros[1]);
		double C = Double.parseDouble(numeros[2]);
		
		double maiorAB = (A+B+Math.abs(A-B))/2;
		double maiorABC = (C+maiorAB+Math.abs(maiorAB-C))/2;
				
		System.out.printf("%.0f eh o maior",maiorABC);
	}
}
