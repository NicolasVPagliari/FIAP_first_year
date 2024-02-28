import java.util.Scanner;

public class Exemp08 {

	static Scanner e = new Scanner(System.in);
	// vetor global
	static String[] linhaProdutos = new String[] { "Computador", "Notebook", "Tablet" };

	public static void main(String[] args) {

		// vetor local
		String[] meses = new String[] { "Jan", "Fev", "Mar" };

		// chamada função carregaMatriz
		int[][] produtos = carregaMatriz(meses);

		// chamada função soma dos produtos
		int[] somaProduto = somaLinhaProduto(produtos);

		// chamada função soma mês
		int[] somaMes = somaColunaMes(produtos);

		// chamada procedimento relatório
		relatorio(meses, somaProduto, somaMes);
	}

	public static int[][] carregaMatriz(String[] meses) {

		int[][] produtos = new int[3][3];

		for (int i = 0; i < 3; i++) {
			System.out.println(linhaProdutos[i]);
			for (int j = 0; j < 3; j++) {
				System.out.print("Quantidade no mês de " + meses[j] + ": ");
				produtos[i][j] = e.nextInt();
			}
		}

		return produtos;
	}

	public static int[] somaLinhaProduto(int[][] produtos) {

		int[] somaProdutos = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				somaProdutos[i] += produtos[i][j];
			}
		}

		return somaProdutos;
	}

	public static void relatorio(String[] meses, int[] somaProdutos, int[] somaMes) {

		// exibir soma dos produtos
		System.out.println("Soma dos Produtos no trimestre");
		for (int i = 0; i < 3; i++) {
			System.out.println(linhaProdutos[i] + " - " + somaProdutos[i]);
		}

		// exibir soma dos meses
		System.out.println("Soma dos Meses no trimestre");
		for (int i = 0; i < 3; i++) {
			System.out.println(linhaProdutos[i] + " - " + somaMes[i]);
		}
	}

	public static int[] somaColunaMes(int[][] produtos) {

		int[] somaMes = new int[3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				somaMes[i] += produtos[j][i];
			}
		}

		return somaMes;
	}

}
