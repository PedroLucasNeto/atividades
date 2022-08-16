package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1018 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int valor = scanner.nextInt();
		
		int notas[] = { 100, 50, 20, 10, 5, 2, 1 };
		System.out.println(valor);
		
		for (int i = 0; i < notas.length; i++) {
			int conta = valor / notas[i]; 
			System.out.printf("%d nota(s) de R$ %d ",conta, notas[i]);
			valor = valor % notas[i];
		}
		scanner.close();
	}
}
