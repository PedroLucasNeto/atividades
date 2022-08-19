package listaExerciciosRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		int adult = 18;
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			list.add(scanner.nextInt());
			if (list.get(i) >= adult) {
				sum += 1;
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
