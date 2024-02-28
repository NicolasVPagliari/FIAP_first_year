import java.util.Scanner;

public class Exemp06 {

	static Scanner e = new Scanner(System.in);
	static String nome;

	public static void main(String[] args) {
		double media = 0;
		
		System.out.print("Digite o nome: ");
		nome=e.next();

		// CAHAMDA FUNÇÃO
		// criamos uma variável double para receber o retorno da função
		
		media = notas();

		// CHAMADA PROCEDIMENTO
		//com passagem de parâmetro 
		//parâmentro real
		
		analisa(media);

	}
	
	//PROCEDIMENTO ANALISA MÉDIA
	
	public static void analisa(double media) {
		
		System.out.println("------PROCEDIMENTO ANÁLISE------");
		System.out.println("Média: "+media);
		if(media >=6) {
			System.out.println(nome+" - Aprovado");
		}else if(media>=4) {
			System.out.println(nome+" - Exame");
		}else {
			System.out.println(nome+" - DP Direto");
		}
		
	}
	

	// FUNÇÃO RETORNA DOUBLE A MÉDIA DO ALUNO
	public static double notas() {

		double nota1 = 0, nota2 = 0, media = 0;
		
		System.out.println("------FUNÇÃO NOTAS------");
		System.out.print("Digite Nota 1: ");
		nota1 = e.nextDouble();
		System.out.print("Digite Nota 2: ");
		nota2 = e.nextDouble();

		media = (nota1 + nota2) / 2;

		return media;

	}

}
