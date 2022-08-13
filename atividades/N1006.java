package atividades;

import java.util.Locale;
import java.util.Scanner;

public class N1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double nota3 = scanner.nextDouble();
		
		double media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		System.out.println(media);
		scanner.close();
	}

}
