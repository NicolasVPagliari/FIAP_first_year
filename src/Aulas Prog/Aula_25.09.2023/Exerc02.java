import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc02 {

	static Scanner e = new Scanner(System.in);
	static DecimalFormat num = new DecimalFormat ("##,###,000.00");

	public static void main(String[] args) {

		int codigoCaminhao = 0, cargaQtd;

		System.out.println("Insira o código do caminhão: ");
		codigoCaminhao = e.nextInt();

		System.out.println("Carga do caminhão em toneladas: ");
		cargaQtd = e.nextInt();

		// chamada função calculo por kg

		double precoSemImposto = calculoSemImposto(cargaQtd);

		// chamada função preco total

		double precoTotal = calculoPrecoTotal(precoSemImposto);

		System.out.println("O preço total será [R$" + num.format(precoTotal) + "]");
	}

	public static double calculoSemImposto(int cargaQtd) {

		int codigo = 0;
		double precoSemImposto = 0;

		cargaQtd = cargaQtd * 1000;

		System.out.println("------------");

		System.out.println("Insira o código da carga: ");
		codigo = e.nextInt();

		while (codigo < 1 || codigo > 30) {
			System.out.println("Insira um código válido: ");
			codigo = e.nextInt();
		}

		if (codigo < 11) {
			precoSemImposto = cargaQtd * 120;
		} else if (codigo < 20) {
			precoSemImposto = cargaQtd * 200;
		} else {
			precoSemImposto = cargaQtd * 280;
		}

		return precoSemImposto;
	}

	public static double calculoPrecoTotal(double precoSemImposto) {

		double precoTotal = 0;
		int codigo = 0;

		System.out.println("------------");

		System.out.println("Insira o código do estado: ");
		codigo = e.nextInt();

		while (codigo != 1 && codigo != 2 && codigo != 3 && codigo != 4) {
			System.out.println("Insira um código válido: ");
			codigo = e.nextInt();
		}

		if (codigo == 1) {
			precoTotal = precoSemImposto * 1.25;
		} else if (codigo == 2) {
			precoTotal = precoSemImposto * 1.20;
		} else if (codigo == 3) {
			precoTotal = precoSemImposto * 1.15;
		}

		return precoTotal;
	}

}
