import java.util.Scanner;

public class Aula06_Exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);

		String name[]= new String [10];
		
		String rightName = null;
		
		for(int cont=0; cont < 10;cont++) {
			
			System.out.println("Digite o nome "+(cont+1)+":");
			name[cont]=e.next();
			
		}
		
		System.out.println("Digite o nome que procura: ");
		rightName=e.next();
		
		
		
		for (int cont=0; cont < 10;cont++) {
			
			if (rightName.equalsIgnoreCase(name[cont])) {
				System.out.println("Você achou! Posição:"+(cont+1));
			
			} else {
				System.out.println("Não achou!");
			}
			
		}	
	}

}
