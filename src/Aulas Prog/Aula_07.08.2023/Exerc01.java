import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner(System.in);
		
		double temp[] = new double [7];
		String semana[] = new String[] {"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};
		int cont=0;
		
		double maiorTemp=0,menorTemp=0;
		int maiorDia = 0,menorDia = 0;
		
		
		//CARREGAR VETORES
		
		while(cont<7) {
			
			System.out.println("Digite a temperatura na "+semana[cont]+":");
			temp[cont]=e.nextDouble();
			
			
			
			//MAIOR TEMPERATURA
			
			if(temp[cont]>maiorTemp) {
				maiorTemp=temp[cont];
				maiorDia=cont;
			}
			
			//MENOR TEMPERATURA
			
			if(cont==0) {
				menorTemp=temp[cont];
				menorDia=cont;
			} else {
					if (temp[cont]<menorTemp) {
						menorTemp=temp[cont];
						menorDia=cont;
					}
				}
			cont++;
			}
			System.out.println("Maior temperatura "+maiorTemp+" em um(a) "+semana[maiorDia]);
			System.out.println("Menor temperatura "+menorTemp+" em um(a) "+semana[menorDia]);
		
		
		
		
	}

}
