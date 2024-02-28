import java.util.Scanner;

public class Aula06_Exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		
		String nome[] = new String[] {"ANA","JOÃO","ROBERTO","JULIO","MARCÃO"};
		double salario[] = new double [5];
		int tempo[] = new int [5];
		
		for (int i=0;i<5;i++) {
			
			System.out.println("-------- "+(i+1)+"º Funcionário --------");
			
			System.out.println("Informe o nome do funcionário: "+nome[i]);
			
			System.out.println("Informe o salário do funcionário: ");
			salario[i]=e.nextDouble();
			
			System.out.println("Informe o tempo do funcionário: ");
			tempo[i]=e.nextInt();
			
		}
		
		System.out.println("-------- Funcionários que não terão aumento --------");
		
		for (int i=0;i<5;i++) {
			if (tempo[i]<= 5 && salario[i] <=780) {
				
				System.out.println(nome[i]);
			}
		}
		
		
		
		
		
		
		
		
	}
}
