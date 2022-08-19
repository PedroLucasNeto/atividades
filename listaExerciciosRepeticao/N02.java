package listaExerciciosRepeticao;

public class N02 {
	public static void main(String[] args) {
		int soma = 0;
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for (int i = 0; i < 16; i++) {
			
			int A = array[0];
			int An = array[14];
			int N = array.length;
			soma = (N * (A + An))/2;
		}
		System.out.println(soma);
		
	}

}
