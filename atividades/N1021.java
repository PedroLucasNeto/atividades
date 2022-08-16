package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1021 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double notas[] = { 100, 50, 20, 10, 5, 2 };
		double moedas[] = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
		double entrada = scanner.nextDouble();

		for (int i = 0; i < notas.length; i++) {
			double contaNotas = entrada / notas[i];
			entrada %= notas[i];
			System.out.printf("\n%.0f Notas de %.2f", Math.floor(contaNotas), notas[i]);
		}
		System.out.println("\nMOEDAS");

		for (int c = 0; c < moedas.length; c++) {
			double contaMoedas = entrada / moedas[c];
			entrada %= moedas[c];
			System.out.printf("\n%d Moedas de %.2f", (int) (contaMoedas), moedas[c]);
		}
		scanner.close();
	}

}
