/**
 * 
 */
package listaExerciciosRepeticao;

import java.util.Scanner;

public class N06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int input;
		for (int i=0; i<20; i++) {
			input = scanner.nextInt();
			sum+=input;
		}
		System.out.println(sum);
		scanner.close();
	}

}
