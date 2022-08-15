package atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1015 {
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] entrada = null;
		List<Double> lista = new ArrayList<Double>(); 
		
		for (int i =0; i<2; i++) {
			entrada = scanner.nextLine().split(" ");
			lista.add(Double.parseDouble(entrada[0]));
			lista.add(Double.parseDouble(entrada[1]));
		}
		
		double x1 = lista.get(0);
		double y1 = lista.get(1);
		double x2 = lista.get(2);
		double y2 = lista.get(3);
		double resultado = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));		
		
		System.out.printf("%.4f",resultado);
		scanner.close();
	}

}
