package exercism;

import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		double target = scanner.nextDouble();
		for (int i = 0; i < input.length; i++) {
			for (int c = 1; c < input.length; c++) {
				double sum = Double.parseDouble(input[i]) + (Double.parseDouble(input[c]));
				if (sum == target) {
					System.out.println(i + "," + c);
				}
			}
		}
		scanner.close();
	}
}
