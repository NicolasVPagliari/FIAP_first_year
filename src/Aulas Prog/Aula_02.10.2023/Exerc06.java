import java.util.Scanner;

public class Exerc06 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		char[] tipoSexo = carregarSexo();
		char[] corOlho = carregarOlho();
		char[] corCabelo = carregaCabelo();
		int[] idade = carregaIdade();
		double mediaIdade = carregaMedia(idade,corOlho,corCabelo);
		int maiorIdade = carregaMaiorIdade(idade);
		int qtdEspecifico = carregaEspecifico(tipoSexo,idade,corOlho,corCabelo);

	}

	public static char[] carregarSexo() {

		char[] sexos = new char[5];

		for (int i = 0; i < 5; i++) {

			System.out.print("Informe o sexo da " + (i + 1) + "ª pessoa: ");
			sexos[i] = e.next().toUpperCase().charAt(0);

			while (sexos[i] != 'M' && sexos[i] != 'F') {
				System.out.print("Informe o sexo da " + (i + 1) + "ª pessoa com 'M' ou 'F': ");
				sexos[i] = e.next().toUpperCase().charAt(0);
			}
		}
		return sexos;
	}

	public static char[] carregarOlho() {
		char[] olhos = new char[5];

		for (int i = 0; i < 5; i++) {

			System.out.print("Informe a cor dos olhos da " + (i + 1) + "ª pessoa: ");
			olhos[i] = e.next().toUpperCase().charAt(0);

			while (olhos[i] != 'A' && olhos[i] != 'C') {
				System.out.print("Informe a cor dos olhos da " + (i + 1) + "ª pessoa com 'A'-Azul ou 'C'-Casatnho: ");
				olhos[i] = e.next().toUpperCase().charAt(0);
			}
		}
		return olhos;
	}
	
	public static char[] carregaCabelo() {
		
		char [] cabelo = new char [5];
		
		for(int i=0;i<5;i++) {
			
			System.out.print("Informe a cor do cabelo da " + (i + 1) + "ª pessoa: ");
			cabelo[i] = e.next().toUpperCase().charAt(0);
			
			while (cabelo[i] != 'L' && cabelo[i] != 'C' && cabelo[i] != 'P') {
				System.out.print("Informe a cor dos olhos da " + (i + 1) + "ª pessoa com 'L'-Louro ou 'C'-Casatnho ou 'P'-Preto: ");
				cabelo[i] = e.next().toUpperCase().charAt(0);
			}
		}
		
		
		return cabelo;
	}
	
	public static int[] carregaIdade() {
		
		int [] idade = new int [5];
		
		for(int i=0;i<5;i++) {
			System.out.print("Informe a idade da " + (i + 1) + "ª pessoa: ");
			idade[i]=e.nextInt();
		}
		
		return idade;
	}

	public static double carregaMedia(int []idade, char []corOlho, char [] corCabelo) {
		
		double media = 0;
		int qtd = 0;
		
		for(int i=0;i<5;i++) {
			if(corOlho[i] == 'C' && corCabelo[i] == 'P') {
				media+=idade[i];
				qtd++;
			}
		}
		
		media=media/qtd;
		
		return media;
	}

	public static int carregaMaiorIdade(int []idade) {
		
		int maiorIdade = 0;
		
		for(int i=0;i<5;i++) {
			if(maiorIdade<idade[i]) {
				maiorIdade=idade[i];
			}
		}
		
		return maiorIdade;
	}
	
	public static int carregaEspecifico(char []tipoSexo, int []idade, char []corOlho, char []corCabelo) {
		
		int qtdEspecial = 0;
		
		
		
		return qtdEspecial;
	}
	
}
