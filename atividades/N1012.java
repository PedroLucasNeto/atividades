package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String [] entrada = scanner.nextLine().split(" ");
		double A = Double.parseDouble(entrada[0]);
		double B = Double.parseDouble(entrada[1]);
		double C = Double.parseDouble(entrada[2]);
		
		double TRIANGULO = A*C/2;
		double CIRCULO = 3.14159*Math.pow(C, 2);
		double TRAPEZIO = (A+B)*C/2;
		double QUADRADO = B*B;
		double RETANGULO = A*B;
		
		System.out.printf("TRIANGULO: %.4f\nCIRCULO: %.4f\nTRAPEZIO: "
				+ "%.4f\nQUADRADO: %.4f\nRETANGULO: %.4f", TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
		scanner.close();
	}

}
