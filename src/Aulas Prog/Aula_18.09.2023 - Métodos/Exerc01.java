import java.util.Scanner;

public class Exerc01 {
	
	static Scanner e = new Scanner (System.in);
	static String nome;

	public static void main(String[] args) {
		int opcao=0;
		
		System.out.print("Informe o nome do hóspede: ");
		nome=e.next();
		
		while (opcao!=4) {
			
			System.out.println("Acomodações e Valores");
			System.out.println("[1] - Standard R$380,00");
			System.out.println("[2] - Standard R$450,00");
			System.out.println("[3] - Standard R$560,00");
			switch(opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: System.exit(0);
				break;
			default: System.out.println("Opção inválida - Digite novamente");
			}
		}

	}
	
	public static double calculoEstadia() {
		double estadia=0, diaria=0;
		int dias=0;
		
		System.out.println("1 - Standard");
		
		
		estadia=diaria*dias;
		
		return estadia;
	}

}
