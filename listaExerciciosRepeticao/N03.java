package listaExerciciosRepeticao;

import java.util.Scanner;

public class N03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		int quantity = scanner.nextInt();
		
		for (int i = 0; i <quantity; i++) {
			System.out.println(userName);
		}
		
		scanner.close();
	}
}
