import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int matriz[][] = new int[4][5];

		for (int i = 0; i < 4; i++) {
			System.out.println("Informe o código do cliente: ");
			matriz[i][0] = e.nextInt();

			System.out.println("Informe a quantidade de milhas: ");
			matriz[i][1] = e.nextInt();

			System.out.println("Informe a categoria do cliente: ");
			matriz[i][2] = e.nextInt();

			while (matriz[i][2] > 3 && matriz[i][2] == 0) {
				System.out.println("Informe a categoria do cliente entre 1, 2 ou 3: ");
				matriz[i][2] = e.nextInt();
			}

			if (matriz[i][2] == 1) {
				matriz[i][4] = matriz[i][1] + 10000;
				matriz[i][3] = 10000;
			} else {
				if (matriz[i][2] == 2) {
					matriz[i][4] = matriz[i][1] + 5000;
					matriz[i][3] = 5000;
				} else {
					if (matriz[i][2] == 3) {
						matriz[i][4] = matriz[i][1];
						matriz[i][3] = 0;
					}
				}
			}

		}
		for(int i=0;i<4;i++) {
			System.out.println("Código do cliente:"+matriz[i][0]+"\t"+"Quantidade de milhagem:"+matriz[i][1]+"\t"+"Categoria:"+matriz[i][2]+"\t"+"Bônus:"+matriz[i][3]+"\t"+"Milhagem atual:"+matriz[i][4]+"\t");
		}
	}
}
