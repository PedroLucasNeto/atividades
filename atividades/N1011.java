package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		double raio = scanner.nextDouble();
		double volume = (4.0/3)*pi*Math.pow(raio, 3);
		System.out.printf("%.3f",volume);
		scanner.close();
	}

}
