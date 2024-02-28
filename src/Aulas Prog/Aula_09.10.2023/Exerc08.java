package aula0910;

import java.util.Scanner;

public class Exerc08 {
	
	static Scanner e = new Scanner (System.in);

	public static void main(String[] args) {
		
		//--------------------------------------
		//CARREGANDO NA MAIN
		
		String[] nomesProdutos = new String[]{"Notebook","Computadores","Tablets","Servidores"};
		int[] metaVendas = new int [] {100,150,200,250};

		//---------------------------------------
		//CHAMADA MÉTODOS E FUNÇÕES
		
		//A
		int[][] arrayVendas = carregaVendas(nomesProdutos);
		
		//B
		int[] arrayTotalProdutos = carregaTotalProdutos(arrayVendas);
		
		//C
		int[] arrayTotalTrimestres = carregaTotalTrimestres(arrayVendas);
		
		//D
		char[] atingiuMetas = verificaMetas(arrayTotalProdutos, metaVendas);
		
		//E
		mostrarResultados(atingiuMetas, nomesProdutos);
	}
	
	//--------------------------------------
	public static int[][] carregaVendas(String[] nomesProdutos) {
		
		int[][] arrayVendas = new int [4][3];
		
		for(int i=0;i<4;i++) {
			
			System.out.println("------ "+nomesProdutos[i]+" ------");
			
			for(int j=0;j<3;j++) {
				arrayVendas[i][j]=(int) (Math.random()*100);
				System.out.println("Quantidade de produtos vendidos no "+(j+1)+"º Trimestre: "+arrayVendas[i][j]);
			}
			
		}
		
		return arrayVendas;
	}
	
	//--------------------------------------
	public static int[] carregaTotalProdutos(int[][] arrayVendas) {
		
		int[] arrayTotalProdutos = new int [4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				arrayTotalProdutos[i]+=arrayVendas[i][j];
			}
		}
		
		return arrayTotalProdutos;
	}
	
	//--------------------------------------
	public static int[] carregaTotalTrimestres(int[][] arrayVendas) {
		
		int[] arrayTotalTrimestres = new int [3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arrayTotalTrimestres[i]+=arrayVendas[j][i];
			}
		}
		
		return arrayTotalTrimestres;
	}
	
	//--------------------------------------
	public static char[] verificaMetas(int[] arrayTotalProdutos, int[]metaVendas) {
		
		char[] atingiuMetas = new char [4];
		
		for(int i=0;i<4;i++) {
			if(arrayTotalProdutos[i]>=metaVendas[i]) {
				atingiuMetas[i]='S';
			} else {
				atingiuMetas[i]='N';
			}
			
		}
		
		return atingiuMetas;
	}
	
	//--------------------------------------
	public static void mostrarResultados(char[] atingiuMetas,String[] nomesProdutos) {
		
		for(int i=0;i<4;i++) {
			
			if(atingiuMetas[i]=='S') {
				System.out.println("====================================");
				System.out.println("O produto ["+nomesProdutos[i]+"] atingiu a meta!");
			} else {
				System.out.println("====================================");
				System.out.println("O produto ["+nomesProdutos[i]+"] não atingiu a meta!");
			}
			
		}
		
	}
	
}
