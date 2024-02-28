import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		DecimalFormat moeda = new DecimalFormat ("R$ #,##0.00");
		
		String lojas[]= new String [] {"A","B","C","D","E","F","G","H"};
		String produtos[]= new String [] {"W","X","Z","Y"};
		double precos [][] = new double [4][8];
		
		for(int i=0;i<4;i++) {
			System.out.println(produtos[i]);
			for (int j=0;j<8;j++) {
				System.out.println("Informe o preço do produto"+produtos[i]
						+" na loja "+lojas[j]+":");
				precos[i][j]=(double)(Math.random()*190);
			}
		}
		
		System.out.println("Produtos que custam menos de R$120,00");
		System.out.println("");
		
		for(int i=0;i<4;i++) {
			System.out.println("Produto: "+produtos[i]);
			for(int j=0;j<8;j++) {
				if (precos[i][j]<120) {
					System.out.println("Loja "+lojas[j]+" Preço "+moeda.format(precos[i][j]));;
				}
			}
		}

	}

}
