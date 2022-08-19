package listaExerciciosRepeticao;

import java.util.Scanner;

public class N05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int input = scanner.nextInt();
			sum += input;
		}
		System.out.println(sum);
		scanner.close();
	}
	
}
