package atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class N1037 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int entrada = scanner.nextInt();
		int[] array = new int[entrada];
		
		for (int i = 0; i <array.length; i++) {
			array [i]= scanner.nextInt();;
			System.out.println(array[i]+"\n");
		}
		
	}

}
