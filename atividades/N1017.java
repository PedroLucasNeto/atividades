package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1017 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double tempoGasto = scanner.nextDouble();
		double velocidadeMedia = scanner.nextDouble();
		double kmL = 12;
		double resultado = tempoGasto*velocidadeMedia/kmL;
		System.out.printf("%.3f",resultado);
		scanner.close();
	}

}
