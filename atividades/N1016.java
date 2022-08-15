package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int distancia = scanner.nextInt();
		
		System.out.printf("%d minutos",(distancia*2));
		scanner.close();
	}
}
