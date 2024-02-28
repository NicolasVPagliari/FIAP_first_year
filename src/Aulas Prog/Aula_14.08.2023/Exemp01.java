import java.util.Scanner;

public class Exemp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		int numeros [][] = new int [3][3];
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				
				System.out.println("Matriz números ["+linha+","+coluna+"]:");
				numeros[linha][coluna]=e.nextInt();
				
			}
		}
		
		for (int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.print(numeros[linha][coluna]+"\t");
			}
			System.out.println("");
		}

	}

}
