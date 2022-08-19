package listaExerciciosRepeticao;

import java.util.Scanner;

public class N04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		for (int i = 0; i <10; i++) {
			System.out.println(userName);
		}
		scanner.close();
	}
}
