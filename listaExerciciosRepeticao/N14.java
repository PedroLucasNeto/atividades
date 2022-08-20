package listaExerciciosRepeticao;

import java.util.Scanner;

public class N14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < 20; i++) {
			int input = scanner.nextInt();
			
			if (input>0 && input<100) {
				count1+=1;
			}else if (input >100 && input <200) {
				count2+=1;
			}
			
		}
		System.out.println(count1 + " numero(s) entre 0 e 100\n"+count2+" numero(s) entre 101 e 200");
		scanner.close();
	}

}
