package listaExerciciosRepeticao;

import java.util.Scanner;

public class N11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int count = 0;
		int target = 8;
		for (int i=0; i<20;i++) {
			input = Integer.parseInt(scanner.nextLine());
			if (input>target) {
				count+=1;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
