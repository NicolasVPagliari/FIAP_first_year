import java.util.Scanner;

public class Exemp02 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;

		while (opcao != 5) {
			System.out.println("[1] - Adição");
			System.out.println("[2] - Subtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			System.out.println("[5] - Sair");

			System.out.print("Escolha uma opção: ");
			opcao = e.nextInt();

			switch (opcao) {

			case 1:
				adicao();
				break;
			case 2:
				subtracao();
				break;
			case 3:
				multiplicacao();
				break;
			case 4:
				divisao();
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

	public static void adicao() {
		int n1 = 0, n2 = 0, resultado = 0;

		System.out.println("------ROTINA ADIÇÃO------");
		System.out.print("Digite o primeiro valor:");
		n1 = e.nextInt();
		System.out.print("Digite o segundo valor:");
		n2 = e.nextInt();

		resultado = n1 + n2;
		System.out.println("Resultado: " + resultado);
	}

	// SUBTRAÇÃO

	public static void subtracao() {
		int n1 = 0, n2 = 0, resultado = 0;

		System.out.println("------ROTINA SUBTRAÇÃO------");
		System.out.print("Digite o primeiro valor:");
		n1 = e.nextInt();
		System.out.print("Digite o segundo valor:");
		n2 = e.nextInt();

		resultado = n1 - n2;
		System.out.println("Resultado: " + resultado);

	}

	// MULTIPLICAÇÃO

	public static void multiplicacao() {
		int n1 = 0, n2 = 0, resultado = 0;

		System.out.println("------ROTINA MULTIPLICAÇÃO------");
		System.out.print("Digite o primeiro valor:");
		n1 = e.nextInt();
		System.out.print("Digite o segundo valor:");
		n2 = e.nextInt();

		resultado = n1 * n2;
		System.out.println("Resultado: " + resultado);

	}

	// DIVISÃO

	public static void divisao() {
		int n1 = 0, n2 = 0, resultado = 0;

		System.out.println("------ROTINA DIVISÃO------");
		System.out.print("Digite o primeiro valor:");
		n1 = e.nextInt();
		System.out.print("Digite o segundo valor:");
		n2 = e.nextInt();

		resultado = n1 / n2;
		System.out.println("Resultado: " + resultado);

	}
}
