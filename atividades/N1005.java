package atividades;

import java.util.Scanner;

public class N1005 {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		
		double media = (A*3.5 + B*7.5)/11;
		
		System.out.printf("MEDIA = %.4f",media);
		
		scanner.close();
	}

}
