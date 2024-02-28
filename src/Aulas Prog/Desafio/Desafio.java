import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		String produtos[] = new String[] { "Notebook", "Computadores", "Tablets", "Servidores" };
		int matriz[][] = new int[7][4];
		int melhorLinha = 0, piorLinha = 0, melhorLinhaProd = 0, piorLinhaProd = 0;

		for (int trimestre = 0; trimestre < 4; trimestre++) {

			System.out.println("--------------------------------");
			System.out.println("Insira a quantidade dos produtos no " + (trimestre + 1) + "º Trismtre");

			// METAS

			matriz[6][trimestre] += (int) (Math.random() * 10);

			for (int produto = 0; produto < 4; produto++) {
				System.out.println("");
				System.out.print("Quantidade de [" + (produtos[produto]) + "] ->");
				matriz[trimestre][produto] = e.nextInt();

				// SOMA DOS PRODUTOS DE CADA TRIMESTRE

				matriz[4][trimestre] += matriz[trimestre][produto];

				// SOMA DE CADA PRODUTO EM TODOS OS TRIMESTRES

				matriz[5][produto] += matriz[trimestre][produto];
			}
		}

		// SAÍDA DA MATRIZ
		
		System.out.println("--------------------------------");

		for (int trimestre = 0; trimestre < 7; trimestre++) {
			for (int produto = 0; produto < 4; produto++) {
				System.out.print(matriz[trimestre][produto] + "\t");
			}
			System.out.println("");
		}

		// MELHOR LINHA E PIOR LINHA

		for (int contador = 0; contador < 4; contador++) {

			// IF MELHOR LINHA

			if (matriz[5][contador] > melhorLinha) {
				melhorLinha = matriz[5][contador];
				melhorLinhaProd = contador;
			}

			// IF PIOR LINHA

			if (contador == 0) {
				piorLinha = matriz[5][contador];
				piorLinhaProd = contador;
			} else if (matriz[5][contador] < piorLinha) {
				piorLinha = matriz[5][contador];
				piorLinhaProd = contador;
			}
		}
		
		System.out.println("--------------------------------");
		System.out.println("Melhor linha " + produtos[melhorLinhaProd]);
		System.out.println("Pior linha " + produtos[piorLinhaProd]);

		// TRIMESTRES QUE ATINGIRAM A META

		System.out.println("--------------------------------");
		System.out.println("Trimestres que atingiram a meta");
		System.out.println("");

		for (int contador = 0; contador < 4; contador++) {
			if (matriz[4][contador] >= matriz[6][contador]) {
				System.out.println((contador + 1) + "º Trimestre");
			}
		}

		e.close();
	}
}
