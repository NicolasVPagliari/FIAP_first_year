import java.util.Scanner;

public class Exemp07 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		// chamada da função
		String[] nomesAlunos = carregaNome();

		// chamada procedimento
		listaAlunos(nomesAlunos);

	}

	public static String[] carregaNome() {

		String[] nomesAlunos = new String[4];
		
		System.out.println("Função - Carrega Nomes Alunos");

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i + 1) + "° nome:");
			nomesAlunos[i] = e.next();
		}

		return nomesAlunos;
	}

	public static void listaAlunos(String[] nomesAlunos) {

		for (int i = 0; i < 4; i++) {
			System.out.println(nomesAlunos[i]);
		}
		
	}

}
