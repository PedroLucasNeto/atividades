package listaExerciciosRepeticao;

import java.util.Scanner;

public class N09 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int youngest = 200;
		String nameOfYoungestPerson = "";

		for (int i = 0; i < 3; i++) {
			String name = scanner.nextLine();
			int age = Integer.parseInt(scanner.nextLine());

			if (youngest > age) {
				youngest = age;
				nameOfYoungestPerson = name;

			}
		}
		System.out.println(nameOfYoungestPerson + youngest);
		scanner.close();
	}

}
