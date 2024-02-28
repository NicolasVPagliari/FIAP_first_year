import java.util.Scanner;

public class Exemp04 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao=0, n1=0, n2=0;

		while (opcao != 5) {
			System.out.println("[1] - Adição");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Sair");

			System.out.print("Escolha uma opção: ");
			opcao = e.nextInt();
			
			if(opcao > 0 && opcao < 5) {
				System.out.println("Digite o 1º valor:");
				n1=e.nextInt();
				System.out.println("Digite o 2º valor:");
				n2=e.nextInt();
			}

			switch (opcao) {

			case 1:
				adicao(n1,n2);
				break;
			case 2:
				subtracao(n1,n2);
				break;
			case 3:
				multiplicacao(n1,n2);
				break;
			case 4:
				divisao(n1,n2);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida - digite novamente");
			}
		}

	}

	// ADIÇÃO

	public static void adicao(int n1,int n2) {
		int resultado = 0;

		System.out.println("------ROTINA ADIÇÃO------");
		resultado = n1 + n2;
		System.out.println("Resultado: " + resultado);
	}

	// SUBTRAÇÃO

	public static void subtracao(int n1,int n2) {
		int resultado = 0;

		System.out.println("------ROTINA SUBTRAÇÃO------");
		resultado = n1 - n2;
		System.out.println("Resultado: " + resultado);

	}

	// MULTIPLICAÇÃO

	public static void multiplicacao(int n1,int n2) {
		int resultado = 0;

		System.out.println("------ROTINA MULTIPLICAÇÃO------");
		resultado = n1 * n2;
		System.out.println("Resultado: " + resultado);

	}

	// DIVISÃO

	public static void divisao(int n1,int n2) { 
		int resultado = 0;

		System.out.println("------ROTINA DIVISÃO------");
		resultado = n1 / n2;
		System.out.println("Resultado: " + resultado);

	}
}
