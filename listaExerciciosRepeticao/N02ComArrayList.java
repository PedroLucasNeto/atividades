package listaExerciciosRepeticao;

import java.util.ArrayList;
import java.util.List;

public class N02ComArrayList {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println(lista);
		
		int soma = 0;
		for (int i=1; i<16; i++) {
			lista.add(i);
		}
		int A = lista.get(0);
		int An = lista.get(14);
		int N = lista.size();
		soma = (N * (A + An))/2;
		System.out.println(soma);
	}
}
