import java.util.Scanner;

public class AtividadeVinteTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantas turmas serão contadas?");
		int turmas = entrada.nextInt();
		int alunos;
		int Talunos;
		Talunos = 0;
		alunos = 0;
		int count;
		count = 1;
		
		while (count <= turmas){
			System.out.println("Quantos alunos tem nesta turma?");
			alunos = entrada.nextInt();
			while (alunos > 40){
				System.out.println("As turmas não podem ter mais de 40 alunos!!!");
				System.out.println("Quantos alunos tem nesta turma?");
				alunos = entrada.nextInt();
			}
			Talunos = alunos + Talunos;
			count = count + 1;	
		}
		System.out.println("A média de alunos por turma é de "+(Talunos / turmas));
	
		entrada.close();
		
	}

}
