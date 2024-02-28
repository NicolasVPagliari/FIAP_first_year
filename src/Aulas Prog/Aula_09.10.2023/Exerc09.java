package aula0910;

import java.util.Scanner;

public class Exerc09 {

	static Scanner e = new Scanner(System.in);
	static String[][] arrayHDados = new String[5][2];
	static int[][] arrayHNumero = new int[5][2];

	public static void main(String[] args) {

		String[] arrayNomeProduto = new String[] { "Refrigerante Lata", "Água sem gás", "Água com gás",
				"Suco de Laranja", "Barra de Chocolate" };

		double[] arrayPrecoProduto = new double[] { 2.80, 1.90, 2.10, 2.30, 4.90 };

		String[] arrayNomeServico = new String[] { "Lavanderia", "Sauna", "Almoço", "Café da Manhã", "Jantar" };

		double[] arrayPrecoServico = new double[] { 10.50, 60.80, 42.90, 35.60, 60.40 };

		for (int i = 0; i < 5; i++) {

			System.out.print("Informe o nome do cliente [" + (i + 1) + "]: ");
			arrayHDados[i][0] = e.next();

			System.out.print(
					"Tipo de acomodação S - (Single) D - (Double) SL - (Suite Luxo) SR - (Suite Presidencial): ");
			arrayHDados[i][1] = e.next();

			while (!(arrayHDados[i][1].equalsIgnoreCase("S")) && !(arrayHDados[i][1].equalsIgnoreCase("D"))
					&& !(arrayHDados[i][1].equalsIgnoreCase("SL")) && !(arrayHDados[i][1].equalsIgnoreCase("SR"))) {
				System.out.print("Digite uma acomodação válida: ");
				arrayHDados[i][1] = e.next();
			}

			arrayHNumero[i][0] = i + 1;
			System.out.println("Numero do Quarto: " + arrayHNumero[i][0]);

			System.out.print("Informe a quantidade de diárias: ");
			arrayHNumero[i][1] = e.nextInt();

			System.out.println("---------------------------------------------------");
		}

		// CHAMADA FUNÇÕES E PROCEDIMENTOS

		// CONSUMO DOS PRODUTOS POR HOSPEDAGEM
		int[][] quantidadeProdutos = carregaQuantidadeProdutos(arrayNomeProduto);

		// CONSUMO DOS PRODUTOS POR HOSPEDAGEM
		int[][] quantidadeServicos = carregaQuantidadeServicos(arrayNomeProduto);

		// VALOR DE CADA HOSPEDAGEM
		double[] arrayEstadia = valorEstadia(arrayHDados, arrayHNumero);
		
		// MOSTRAR RELATORIO
		gerarRelatorioGerencial(arrayHDados, arrayHNumero, quantidadeProdutos, quantidadeServicos, arrayEstadia,  arrayPrecoProduto,  arrayPrecoServico);
	}

	// ==============================================
	public static int[][] carregaQuantidadeProdutos(String[] arrayNomeProduto) {

		int[][] quantidadeProdutos = new int[5][5];

		System.out.println("------ Preencher Consumo de Produtos por Hospedagem ------");

		for (int i = 0; i < 5; i++) {
			System.out.println("------ Hospedagem " + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.print("Informe a quantidade consumida do produto [" + arrayNomeProduto[j] + "]: ");
				quantidadeProdutos[i][j] = e.nextInt();
			}
		}

		return quantidadeProdutos;
	}

	// ==============================================
	public static int[][] carregaQuantidadeServicos(String[] arrayNomeServico) {

		int[][] quantidadeServicos = new int[5][5];

		System.out.println("------ Preencher Consumo de Produtos por Hospedagem ------");

		for (int i = 0; i < 5; i++) {
			System.out.println("------ Hospedagem " + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.print("Informe a quantidade consumida no serviço [" + arrayNomeServico[j] + "]: ");
				quantidadeServicos[i][j] = e.nextInt();
			}
		}

		return quantidadeServicos;
	}

	// ==============================================
	public static double[] valorEstadia(String[][] arrayHDados, int[][] arrayHNumero) {

		double[] arrayEstadia = new double[5];

		for (int i = 0; i < 5; i++) {

			switch (arrayHDados[i][1]) {
			case "S":
				arrayEstadia[i] = 245 * arrayHNumero[i][1];
				break;
			case "D":
				arrayEstadia[i] = 280 * arrayHNumero[i][1];
				break;
			case "SL":
				arrayEstadia[i] = 310 * arrayHNumero[i][1];
				break;
			case "SR":
				arrayEstadia[i] = 400 * arrayHNumero[i][1];
				break;
			}
		}

		return arrayEstadia;
	}

	// ==============================================
	public static void gerarRelatorioGerencial (String[][] arrayHDados, int[][] arrayHNumero, int[][] quantidadeProdutos, int[][] quantidadeServicos, double[] arrayEstadia, double[] arrayPrecoProduto, double[]  arrayPrecoServico) {
		
		System.out.println("=================================");
		System.out.println("Relatório Gerencial Diárias Hotel Praça É Nossa");
		System.out.println("=================================");
		
		for(int i=0;i<5;i++) {
			System.out.println("Número do Quarto: "+arrayHNumero[i][0]);
			System.out.println("Nome do cliente: "+arrayHDados[i][0]);
			System.out.println("Tipo de acomodação: "+arrayHDados[i][1]);
			System.out.println("Valor total das diárias: "+arrayEstadia[i]);
		}
		
		double[]totalServico = new double [5];
		double[]totalProduto = new double [5];
		double[]totalGeral = new double [5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			totalServico[i]+=arrayPrecoServico[j]*quantidadeServicos[i][j];
			totalProduto[i]+=arrayPrecoProduto[j]*quantidadeProdutos[i][j];
			totalGeral[i]+=arrayEstadia[i]+totalServico[i]+totalProduto[i];
			}
		}
		
		System.out.println("=================================");
		System.out.println("Relatório Gerencial Diárias Hotel Praça É Nossa");
		System.out.println("=================================");
		
		for(int i=0;i<5;i++) {
			System.out.println("");
			
		}
		
		
	}
	
	
}
