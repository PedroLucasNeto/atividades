package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1019 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int entrada = scanner.nextInt();
		int hora = entrada/3600;
		int minuto = entrada % 3600/60;
		int segundo = entrada % 60;
		// int minuto = entrada / 60;
		// entrada -= minuto * 60;
		System.out.printf("%d : %d : %d", hora, minuto, segundo);

		scanner.close();
	}

}
