import java.util.Scanner;

public class Aula06_Exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner e = new Scanner (System.in);
		
		String gabarito [] = new String [] {"A","A","A","A","A","A","A","A"};
		String prova[] = new String [8];
		
		int numAluno=0;
		double nota=0;
		
		//REPETIÇÃO ALUNOS
		for(int aluno=0;aluno<10;aluno++) {
			
			System.out.println("Digite o número do "+(aluno+1)+"]aluno: ");
			numAluno=e.nextInt();
			
			//REPETIÇÃO QUESTÕES PROVA
			for(int q=0;q<8;q++) {
				
				System.out.println("Digite a resposta questão "+(q+1)+":");
				prova[q]=e.next();
				
				if (gabarito[q].equalsIgnoreCase(prova[q])) {
					nota++;
				}
			}
			
			System.out.println("A nota do aluno "+numAluno+"foi: "+nota);
			nota=0;
		}

				
	}
}
