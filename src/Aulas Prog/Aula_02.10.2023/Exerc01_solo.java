import java.util.Scanner;

public class Exerc01_solo {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		// CHAMADA COM RETORNO

		int[] numeros = carregaVetor();

		int[] ordenado = vetorOrdenado(numeros);
		
		for(int i=0;i<5;i++) {
			System.out.println(ordenado[i]);
		}

	}

	public static int[] carregaVetor() {

		int[] vetorCarregado = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o " + (i + 1) + "º número: ");
			vetorCarregado[i] = e.nextInt();
		}

		return vetorCarregado;
	}

	public static int[] vetorOrdenado(int[] numeros) {

		int substituir = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (numeros[j] > numeros[i]) {
					substituir = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = substituir;
				}
			}
		}

		return numeros;
	}
}