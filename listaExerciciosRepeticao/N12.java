package listaExerciciosRepeticao;

import java.util.Scanner;

public class N12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int count = 0;
		for (int i = 0; i < 20; i++) {
			input = scanner.nextInt();
			if (input % 2 == 0) {
				count += 1;
			}
		}
		System.out.println(count + " números são pares.");
		scanner.close();
	}
}
