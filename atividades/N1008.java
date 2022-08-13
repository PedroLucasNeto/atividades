package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1008 {
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner(System.in);
	double codigo = scanner.nextDouble();
	double qtdHoras = scanner.nextDouble();
	double salario = scanner.nextDouble();
	double resultado = qtdHoras*salario;
	System.out.printf("NUMBER = %.2f\nSALARY = U$ %.2f", codigo, resultado);
	scanner.close();
	}
	

}
