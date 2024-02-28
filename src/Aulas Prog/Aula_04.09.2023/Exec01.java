import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int matriz[][] = new int[5][3];
		int somaArmz[] = new int[4];
		int totalArmz[] = new int[4];
		int somaProd[] = new int[3];
		int prod2 = 0, armzProd2 = 0, menorEstoque = 0, menorEstoqueArmz = 0, maiorEstoqueArmz = 0, maiorEstoque = 0;

		for (int armz = 0; armz < 4; armz++) {
			System.out.println("--- Estoque no armazém (" + (armz + 1) + ") ---");
			for (int prod = 0; prod < 3; prod++) {
				System.out.print("--- Informe a quantidade em estoque do Produto (" + (prod + 1) + ") : ");
				matriz[armz][prod] = e.nextInt();

				// SOMA DOS ARMAZÉNS

				somaArmz[armz] += matriz[armz][prod];

				// ARMAZÉNS + PRODUTO 2

				if (prod == 1 && prod2 < matriz[armz][prod]) {
					prod2 = matriz[armz][prod];
					armzProd2 = armz + 1;
				}

				// SOMA PRODUTOS

				somaProd[prod] += matriz[armz][prod];

			}
		}
		System.out.println("");
		System.out.println("------------ CUSTO DE CADA PRODUTO ------------");
		System.out.println("");

		for (int custo = 0; custo < 3; custo++) {
			System.out.print("--- Informe o custo do Produto (" + (custo + 1) + ") : ");
			matriz[4][custo] = e.nextInt();
		}

		System.out.println("");
		System.out.println("------------ QUANTIDADE DE ITENS EM CADA ARMAZÉM ------------ ");
		System.out.println("");

		for (int i = 0; i < 4; i++) {
			System.out.println("--- Estoque no armazém (" + (i + 1) + ") : " + somaArmz[i]);

			// MENOR ESTOQUE
			if (i == 0) {
				menorEstoque = somaArmz[i];
				menorEstoqueArmz = i + 1;
			} else if (menorEstoque > somaArmz[i]) {
				menorEstoque = somaArmz[i];
				menorEstoqueArmz = i + 1;
			}

			// MAIOR ESTOQUE
			if (maiorEstoque < somaArmz[i]) {
				maiorEstoque = somaArmz[i];
				maiorEstoqueArmz = i + 1;
			}
		}
		System.out.println("");
		System.out.println("------------ ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ------------");
		System.out.println("");
		System.out.println("--- Armazém (" + (armzProd2) + ") : " + prod2);

		System.out.println("");
		System.out.println("------------ ARMAZÉM COM MAIOR E MENOR ESTOQUE ------------");
		System.out.println("");
		System.out.println("--- Armazém (" + (maiorEstoqueArmz) + ") com maior estoque : " + maiorEstoque);
		System.out.println("--- Armazém (" + (menorEstoqueArmz) + ") com menor estoque : " + menorEstoque);

		System.out.println("");
		System.out.println("------------ CUSTO TOTAL DE CADA PRODUTO ------------");
		System.out.println("");

		for (int i = 0; i < 3; i++) {
			System.out.println("--- Informe o custo do Produto (" + (i + 1) + ") = " + somaProd[i] * matriz[4][i]);
		}

		System.out.println("");
		System.out.println("------------ QUANTIDADE DE ITENS EM CADA ARMAZÉM ------------");
		System.out.println("");

		for (int armz = 0; armz < 4; armz++) {
			for (int prod = 0; prod < 3; prod++) {
				totalArmz[armz]+=matriz[armz][prod]*matriz[4][prod];
			}
			
			System.out.println("--- Custo total no armazém (" + (armz + 1) + ") = " + totalArmz[armz]);
		}
	}
}
