package atividades;

import java.util.Scanner;

public class N1020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int entrada = scanner.nextInt();
		int ano = entrada/365;
		int mes = entrada % 365/30;
		int dia = (entrada % 365) % 30;
		
		
		System.out.printf("%d %d %d",ano, mes, dia);
		scanner.close();
	}

}
