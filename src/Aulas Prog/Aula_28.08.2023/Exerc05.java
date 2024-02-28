import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);

		int sem1[][] = new int[5][3];
		int sem2[][] = new int[5][3];
		int anual[][] = new int[5][3];
		int uniAno[] = new int[3];
		int cursoAno[] = new int[5];
		int maiorMatricula = 0, maiorMatriculaCurso = 0;

		System.out.println("Primeiro Semestre");
		System.out.println("");

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Quantidade de matrículas no curso " + (l + 1) + " da unidade " + (c + 1) + ":");
				sem1[l][c] = (int) (Math.random() * 20);

				anual[l][c] += sem1[l][c];
			}
		}

		System.out.println("");

		System.out.println("--------------------");

		System.out.println("");

		System.out.println("Segundo Semestre");
		System.out.println("");

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Quantidade de matrículas no curso " + (l + 1) + " da unidade " + (c + 1) + ":");
				sem2[l][c] = (int) (Math.random() * 20);

				anual[l][c] += sem2[l][c];
			}

		}

		System.out.println("--------------------");

		System.out.println("Matriz anual");

		System.out.println("");

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(anual[l][c] + "\t");

				uniAno[c] += anual[l][c];
				cursoAno[l] += anual[l][c];
			}
			System.out.println(" ");
		}

		System.out.println("--------------------");

		for (int c = 0; c < 3; c++) {
			System.out.print(uniAno[c] + "\t");
		}
		System.out.println("");
		for (int c = 0; c < 5; c++) {
			System.out.print(cursoAno[c] + "\t");

			if (cursoAno[c] > maiorMatricula) {
				maiorMatricula = cursoAno[c];
				maiorMatriculaCurso = c + 1;
			}
		}
		System.out.println("");
		System.out.println("A maior matrícula foi: " + maiorMatricula + " do curso " + maiorMatriculaCurso);

	}
}
