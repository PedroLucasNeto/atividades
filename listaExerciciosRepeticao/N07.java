package listaExerciciosRepeticao;

import java.util.Scanner;

public class N07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int average = 0;
		int quantity = 20;
		int input;
		for (int i=0; i<quantity; i++) {
			input = scanner.nextInt();
			sum+=input;
		}
		average = sum/quantity;
		System.out.println(average);
		scanner.close();
	}
}
