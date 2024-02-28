import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		DecimalFormat dist = new DecimalFormat ("#,##0.00");
		
		String cidades [] = new String [] {"A","B","C","D","E"};
		double distancia [][] = new double [5][5];
		int consumo=0;
		
		for(int l=0;l<5;l++) {
			System.out.println("");
			System.out.println("--------Cidade "+cidades[l]+"--------");
			System.out.println("");
			for(int c=0;c<5;c++) {
				
				if(l!=c) {
					System.out.println("Informe a distâcia entre as cidades de "
							+cidades[l]+" e "+cidades[c]);
					distancia[l][c]=(double)(Math.random()*500);
				}
				
				if(l==c) {
					distancia[l][c]=0;
				}
			}
		}
		
		System.out.println("=====================================");
		
		for(int l=0;l<5;l++) {
			for(int c=0;c<5;c++) {
				System.out.print(dist.format(distancia[l][c])+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("-------- Consumo de combustível por um  veículo --------");
		System.out.println("");
		System.out.print("Informe o consumo de um veículo: ");
		consumo=e.nextInt();
		
		System.out.println("");
		System.out.println("-------- Percursos inferiores a 250 KM --------");
		System.out.println("");
		
		for(int l=0;l<5;l++) {
			for(int c=0;c<5;c++) {
				
				if((distancia[l][c]<250) && (l!=c)) {
					System.out.println("Distância: "+dist.format(distancia[l][c])+" - "
							+ "entre a cidade "+cidades[l]+" e "+cidades[c]);
				}
			}
		}
		
		for(int l=0;l<5;l++) {
			for(int c=0;c<5;c++) {
				if(l!=c) {
					System.out.println("Consumo entre as cidades de "
							+cidades[l]+" e "+cidades[c]+" é: "+dist.format(distancia[l][c])/consumo))+" KM");
				}
				
			}
		}
		
	}

}
