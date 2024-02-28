import java.util.Scanner;

public class Exemp01 {
	
	//global
	static Scanner e = new Scanner (System.in);

	public static void main(String[] args) {
		
		//chamada do procedimento
		
		verificar();
		
		
		e.close();
	}//close main
	
	//PROCEDIMENTO - VOID NÃO TEM RETORNO
	
	public static void verificar() {
		int num = 0;
		
		System.out.println("Digite um número");
		num=e.nextInt();
		
		if(num % 2==0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
	}

}
