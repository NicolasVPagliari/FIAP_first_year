import java.util.Scanner;

public class Exemp05 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		double nota1 = 0, nota2 = 0, media = 0;

		System.out.print("Digite Nome: ");
		System.out.print("Digite Nota 1: ");
		nota1 = e.nextDouble();
		System.out.print("Digite Nota 2: ");
		nota2 = e.nextDouble();

		// CHAMADA DA FUNÇÃO
		media=calculoMedia(nota1,nota2);
		System.out.println("Média: "+media);
		
	}

	// CRIAÇÃO DE FUNÇÃO

	public static double calculoMedia(double nota1, double nota2) {
		double media = 0;
		
		media=(nota1+nota2)/2;

		return media;
	}

}
