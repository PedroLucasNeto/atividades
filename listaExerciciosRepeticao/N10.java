package listaExerciciosRepeticao;

import java.util.Scanner;

public class N10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int input = scanner.nextInt();
		int multiplication = 0;
		for (int i = 1; i < 10; i++) {
			multiplication = input * i;
			System.out.println(input + "*" + i + " = " + multiplication);
	
		}
		scanner.close();
	}

}
