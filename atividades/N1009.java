package atividades;

import java.util.Scanner;

public class N1009 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		double salario = scanner.nextDouble();
		double vendas = scanner.nextDouble();
		double total = salario + vendas*0.15;
		System.out.printf("%s Irá receber: %.2f",nome, total);
		scanner.close();
	}

}
