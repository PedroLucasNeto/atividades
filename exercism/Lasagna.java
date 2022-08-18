package exercism;

import java.util.Scanner;

public class Lasagna {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lasagna lasagna = new Lasagna();
		System.out.printf("The lasagna should be in the oven for: " + lasagna.expectedMinutesInOven() + " minutes");
		System.out.println("\nType in the time the lasagna has been in the oven:");
		int minutesInOven = scanner.nextInt();
		System.out.println("There are " + lasagna.remainingMinutesInOven(minutesInOven) + " more minutes to go");
		System.out.println("\nType in the amount of layers you've put on the lasagna: ");
		int layers = scanner.nextInt();
		int minutes = 2;
		System.out.println(lasagna.preparationTimeInMinutes(layers, minutes));
		int preparationTimeInMinutes = lasagna.preparationTimeInMinutes(layers, minutes);
		System.out.println("\nLAST TASK = " + lasagna.preparationTimeInMinutes(layers, minutesInOven));

	}

	public int expectedMinutesInOven() {
		return 40;
	}

	public int remainingMinutesInOven(int n) {
		return 40 - n;
	}

	public int preparationTimeInMinutes(int layers, int minutes) {
		return layers * minutes;
	}

	public int totalTimeInMinutes(int layers, int minutesInOven ) {
		return layers + minutesInOven;
	}

}
