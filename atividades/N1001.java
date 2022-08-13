package atividades;

import java.util.Scanner;

public class N1001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int resultado = A + B;
		System.out.printf("X = %d", resultado);
		scanner.close();
	}

}
