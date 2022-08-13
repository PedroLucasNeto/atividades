package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int prod = A*B;
		System.out.printf("PROD = %d", prod);
		
		scanner.close();
	}

}
