import java.util.Scanner;

public class AtividadeDezesseis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota do aluno");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Informe a segunda nota do aluno");
		double nota2 = entrada.nextDouble();
		
		double media;
		media = (nota1 + nota2)/ 2;
		
		System.out.println("A média do aluno foi de: "+ media);
		
		if (media < 3.1){
			System.out.println("Logo o aluno está REPROVADO!");
		}
		else{
			if (media > 3 && media < 7){
			System.out.println("Logo o aluno está em EXAME!");
			}
			else {
				System.out.println("Logo o alubo está APROVADO!");
			}
		}
		entrada.close();
		
	}


		
}


