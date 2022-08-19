package listaExerciciosRepeticao;

import java.util.Scanner;

public class N08SemArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int count = 0;
		int adult = 18;
		
		for (int i = 0; i < 20; i++) {
			input = scanner.nextInt();
			if (input>=adult) {
				count +=1;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
