import java.util.Scanner;

public class Exemp03 {
	
	static Scanner e = new Scanner (System.in);

	public static void main(String[] args) {
		
		int tempoEmpresa=0;
		double salario=0;
		
	System.out.println("Digite o nome:");
	System.out.println("Digite o tempo:");
	tempoEmpresa=e.nextInt();
	System.out.println("Digite o salário");
	salario=e.nextDouble();
	
	// cahamda procedimento com parâmetro
	analise(tempoEmpresa,salario);//parâmetros reais
		
	}
	
	public static void analise(int tempoEmpresa,double salario) {//parâmetro formal
		
		if(tempoEmpresa > 10 && salario < 5000) {
			System.out.println("Tem direito ao aumento");
		}else {
			System.out.println("Não tem direito ao aumento");
		}
		
	}

}
