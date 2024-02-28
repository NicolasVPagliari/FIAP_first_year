import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		DecimalFormat moeda = new DecimalFormat ("R$ #,##0.00");
		
		int numeros [][] = new int [5][2];
		double valores [][] = new double [5][2];
		double totalGeral =0;
		
		for(int linha=0;linha<5;linha++) {
			
			System.out.println("Produto "+(linha+1));
			
			System.out.println("Digite o código: ");
			numeros [linha][0]=e.nextInt();
			
			System.out.println("Digite o preço: ");
			valores [linha][0]=e.nextDouble();
			
			System.out.println("Digite a quantidade: ");
			numeros [linha][1]=e.nextInt();
			
			valores[linha][1]=valores[linha][0]*numeros[linha][1];
			
			totalGeral+=valores[linha][1];
		}
		
		for(int linha=0;linha<5;linha++) {
			System.out.println("Código "+numeros[linha][0]+" Preço "+valores[linha][0]+" Quantidade "+numeros[linha][1]+" Total "+moeda.format(valores[linha][1]));
		}

	}

}
