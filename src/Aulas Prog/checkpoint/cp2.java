import java.util.Scanner;

public class cp2 {

	static Scanner e = new Scanner(System.in);
	static String[] regioes = new String[] { "Norte", "Sul", "Leste", "Oeste" };
	static int somaVendas = 0;

	public static void main(String[] args) {

		String[] linhasProdutos = new String[] { "perfumaria", "maquiagem", "cabelo", "rosto" };

		// CHAMADA PARA CARREGAR A MATRIZ
		int[][] vendas = carregaVendas(linhasProdutos);

		// CHAMADA PARA SOMAR AS LINHAS DE PRODUTOS
		int[] totalLinhasProdutos = carregaSomaLinhas(vendas);

		// EXIBIR O TOTAL DE VENDAS POR LINHA
		System.out.println("-------- Total de vendas de cada Linha --------");
		for (int i = 0; i < 4; i++) {
			System.out.println(linhasProdutos[i] + " => " + totalLinhasProdutos[i]);
		}

		// CHAMADA PARA EXIBIR A REGIÃO E A LINHA COM A MAIOR VENDA DO MÊS
		maiorVendaRegiao(linhasProdutos, vendas);

		// CHAMADA PARA EXIBIR O RANKING DAS VENDAS POR LINHA
		rankingVendasLinhas(linhasProdutos, totalLinhasProdutos);
	}

	public static int[][] carregaVendas(String[] linhasProdutos) {

		int[][] vendas = new int[4][4];

		for (int i = 0; i < 4; i++) {
			System.out.println("-------- Região " + regioes[i] + " --------");
			System.out.println("Insira a quantidade de vendas das seguintes linhas ");
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + linhasProdutos[j] + "]: ");
				vendas[j][i] = e.nextInt();
				somaVendas += vendas[j][i];
			}
		}
		return vendas;
	}

	public static int[] carregaSomaLinhas(int[][] vendas) {

		int[] totalLinhasProdutos = new int[4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				totalLinhasProdutos[i] += vendas[i][j];
			}
		}
		return totalLinhasProdutos;
	}

	public static void maiorVendaRegiao(String[] linhasProdutos, int[][] vendas) {
		
		int pivo = 0;
		int[] armazenaIndex = new int[4];
		int[][] guardaMatriz = new int [4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				guardaMatriz[i][j]=vendas[i][j];
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (vendas[i][0] < vendas[j][0]) {
					pivo=vendas[i][0];
					vendas[i][0]=vendas[j][0];
					vendas[j][0]=pivo;
				}

				if (vendas[i][1] < vendas[j][1]) {
					pivo=vendas[i][1];
					vendas[i][1]=vendas[j][1];
					vendas[j][1]=pivo;
				}

				if (vendas[i][2] < vendas[j][2]) {
					pivo=vendas[i][2];
					vendas[i][2]=vendas[j][2];
					vendas[j][2]=pivo;
				}

				if (vendas[i][3] < vendas[j][3]) {
					pivo=vendas[i][3];
					vendas[i][3]=vendas[j][3];
					vendas[j][3]=pivo;
				}

			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				if (vendas[i][0] == guardaMatriz[j][0]) {
					armazenaIndex[0] = j;
				}

				if (vendas[i][1] == guardaMatriz[j][1]) {
					armazenaIndex[1] = j;
				}

				if (vendas[i][2] == guardaMatriz[j][2]) {
					armazenaIndex[2] = j;
				}

				if (vendas[i][3] == guardaMatriz[j][3]) {
					armazenaIndex[3] = j;
				}
			}
		}
		

		System.out.println("-------- Regiões e suas melhores linhas --------");
		for (int i = 0; i < 4; i++) {
			System.out.println(regioes[i] + " => " + linhasProdutos[armazenaIndex[i]]);
		}
	}

	public static void rankingVendasLinhas(String[] linhasProdutos, int[] totalLinhasProdutos) {

		int pivo = 0;
		int[] guardaArray = new int[4];
		int[] armazenaIndex = new int[4];

		for (int i = 0; i < 4; i++) {
			guardaArray[i] = totalLinhasProdutos[i];
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (i != j && totalLinhasProdutos[i] > totalLinhasProdutos[j]) {
					pivo = totalLinhasProdutos[i];
					totalLinhasProdutos[i] = totalLinhasProdutos[j];
					totalLinhasProdutos[j] = pivo;
				}

			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (totalLinhasProdutos[i]==guardaArray[j]) {
					armazenaIndex[i] = j;
				}

			}
		}

		System.out.println("-------- Ranking --------");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + "º " + linhasProdutos[armazenaIndex[i]]);
		}
		
	}

}
