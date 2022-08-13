package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1002 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double entrada = scanner.nextDouble();
		double n = 3.14159;
		double area = n*Math.pow(entrada, 2);
		System.out.printf("A=%.4f",area);
		scanner.close();
	}

}
