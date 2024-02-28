import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int m[][] = new int[2][2];
		int n[][] = new int[2][2];
		int maiorElemento = 0;

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Informe o número M{" + l + "," + c + "]");
				m[l][c] = e.nextInt();

				if (m[l][c] > maiorElemento) {
					maiorElemento = m[l][c];
				}
			}
		}
		
		for(int l=0;l<2;l++) {
			for(int c=0;l<2;l++) {
				n[l][c]=m[l][c]*maiorElemento;
				System.out.println("Resultado - R["+l+","+c+"]"+n[l][c]);
			}
		}
	}

}
