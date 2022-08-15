package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1014 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a qtd de KM: ");
		double km = scanner.nextDouble();
		System.out.println("Digite a qtd de litros de gasolina:");
		double litros = scanner.nextDouble();
		double resultado = km/litros;
		System.out.printf("%.3f",resultado);
		scanner.close();
	}

}
