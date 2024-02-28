import java.text.DecimalFormat;
import java.util.Scanner;

public class estudando {
	
	static Scanner e = new Scanner (System.in);
	static DecimalFormat format = new DecimalFormat ("##00,000.00");
	static int [] somaQtdCarros= new int[5];

	public static void main(String[] args) {

		String[] carros = new String[] { "Classic", "Cobalt", "Onix", "Prisma", "Cruze" };
		double[] precos = new double[] { 33600, 44900, 37790, 43150, 55400 };
		
		int [][] qtdCarrosVendidos = carregarQtd (carros);
		relatorioGerencial(carros, precos, qtdCarrosVendidos);

	}
	
	public static int [][] carregarQtd (String [] carros) {
		
		int [][] qtdCarrosVendidos = new int [4][5];
		
		for(int i=0;i<4;i++) {
			System.out.println("Vendas "+(i+1)+"º TRI");
			for(int j=0;j<5;j++) {
				System.out.print("Carro "+carros[j]+": ");
				qtdCarrosVendidos[i][j]=e.nextInt();
			}
		}
		return qtdCarrosVendidos;
	}
	
	public static double [] carregarValorTotal (double[]precos, int[][] qtdCarrosVendidos) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				somaQtdCarros[j] += qtdCarrosVendidos[i][j];
			}
		}
		
		double[] valorTotalCarros = new double [5];
		
		for(int i=0;i<5;i++) {
			valorTotalCarros [i] = somaQtdCarros[i]*precos[i];
		}
		
		return valorTotalCarros;
	}
	
	public static void relatorioGerencial (String[] carros, double[] precos, int[][] qtdCarrosVendidos) {
		
		double [] valorTotalCarros = carregarValorTotal (precos, qtdCarrosVendidos);
		
		System.out.println("Relatório Gerencial");
		
		for(int i=0;i<5;i++) {
			System.out.println("Carro: "+carros[i]+"        Quantidade Geral: "+somaQtdCarros[i]+"        Total: R$"+format.format(valorTotalCarros[i]));
		}
		
		int vendasTotal = 0;
		
		for(int i=0;i<5;i++) {
			vendasTotal+=valorTotalCarros[i];
		}
		
		System.out.println("Total Geral de Vendas 2014: R$"+format.format(vendasTotal));
		
	}
	
	
}
