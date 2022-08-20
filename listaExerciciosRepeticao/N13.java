package listaExerciciosRepeticao;

import java.util.Scanner;

public class N13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int count = 0;

		for (int i = 0; i < 20; i++) {
			int input = scanner.nextInt();
			if (input>0 && input<100) {
				count+=1;
			}
		}
		System.out.println(count+" numero(s) entre 0 e 100.");
		scanner.close();
	}

}
