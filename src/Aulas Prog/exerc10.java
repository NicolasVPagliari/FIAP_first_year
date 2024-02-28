import java.util.Scanner;

public class exerc10 {

	static Scanner e = new Scanner(System.in);
	static int totalCarrosTrimestres[] = new int[5];

	public static void main(String[] args) {

		String[] carros = new String[] { "Classic", "Cobalt", "Onix", "Prisma", "Cruze" };
		double[] precos = new double[] { 33600, 44900, 37790, 43150, 55400 };

		// MÉTODO PARA CARREGAR MATRIZ
		int[][] qtdCarros = carregaMatriz(carros);
		
		// MÉTODO PARA EXIBIR INFORMAÇÕES FINAIS
		relatorioGerencial(carros, qtdCarros, precos);

	}

	// FUNÇÃO CARREGAR MATRIZ QTD CARROS
	public static int[][] carregaMatriz(String[] carros) {

		int[][] qtdCarros = new int[4][5];

		for (int i = 0; i < 4; i++) {
			System.out.println("-------- Vendas " + (i + 1) + "º trimestre --------");
			for (int j = 0; j < 5; j++) {
				System.out.print("Carro " + carros[j] + ": ");
				qtdCarros[i][j] = e.nextInt();
			}
		}
		return qtdCarros;
	}

	// FUNÇÃO CALCULAR O PREÇO TOTAL DE CADA CARRO
	public static double[] calculaTotal(int[][] qtdCarros, double[] precos) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				totalCarrosTrimestres[j] += qtdCarros[i][j];
			}
		}

		double[] totalCarros = new double[5];

		for (int i = 0; i < 5; i++) {
			totalCarros[i]=totalCarrosTrimestres[i]*precos[i];
		}

		return totalCarros;
	}

	// PROCEDIMENTO PARA EXBIR CARRO / QUANTIDADE / TOTAL
	public static void relatorioGerencial (String[] carros, int[][] qtdCarros, double[] precos) {
		double [] totalCarros = calculaTotal (qtdCarros, precos);
		
		System.out.println("------------------------------");
		
		for(int i = 0;i<5;i++) {
			System.out.println("Carro: "+carros[i]+" - Quantidade geral: "+totalCarrosTrimestres[i]+" - Total: R$"+totalCarros[i]);
		}
		
		int totalVendasAno = 0;
		
		for(int i = 0;i<5;i++) {
			totalVendasAno += totalCarros[i];
		}
		
		System.out.println("Total de vendas em 2014: R$"+totalVendasAno);
	}
	
}
