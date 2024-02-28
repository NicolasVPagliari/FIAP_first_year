import java.util.Scanner;

public class Exemp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		int matriz [][] = new int [4][4];
		int somaLinha=0, somaColuna=0, somaTotal=0;
		int somaVetor [] = new int [4];
		//CARREGA MATRIZ
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				System.out.print("Digite o valor [Linha "+i+" - Coluna "+j+"]: ");
				matriz[i][j]=e.nextInt();
				somaTotal+=matriz[i][j];
			}
		}
		
		//SOMAR MATRIZ LINHA E COLUNA
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				somaLinha+=matriz[i][j];
				somaColuna+=matriz[j][i];
			}
			
			System.out.println("Soma linha "+i+":"+somaLinha);
			System.out.println("Soma linha "+i+":"+somaColuna);
		}
		
		//SOMAR MATRIZ COM VETOR
		
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++) {
						somaVetor[i]+=matriz[i][j];
					}
				}
				
		//SOMA VETOR
		for(int i=0;i<4;i++) {
			System.out.println(somaVetor[i]);
		}
		
		System.out.println("Soma total: "+somaTotal);

	}

}
