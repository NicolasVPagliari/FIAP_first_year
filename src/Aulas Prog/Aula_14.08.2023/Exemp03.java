import java.util.Scanner;

public class Exemp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		double matriz [][] = new double [3][4];
		
		for(int i=0;i<3;i++) {
			System.out.println("Aluno "+(i+1));
			for(int j=0;j<3;j++) {
				System.out.println("Digite a nota da "+(j+1)+"ª prova: ");
				matriz[i][j]=e.nextDouble();
				matriz[i][3]+=matriz[i][j];
			}
			matriz[i][3]=matriz[i][3]/3;
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
