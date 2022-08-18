import java.util.Scanner;

public class AtividadeVinteTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a idade do primeiro aluno");
		int idade1 = entrada.nextInt();
		
		System.out.println("Idade do segundo aluno");
		int idade2 = entrada.nextInt();
		
		System.out.println("Informe a idade do terceiro aluno");
		int idade3 = entrada.nextInt();
		
		double media;
		
		media = (idade1 + idade2 + idade3)/ 3;
		System.out.println("A media da idade da turma é de: "+media);
		
		if (media < 25){
			System.out.println("Logo está turma é jovem!");
		}
		else{
			if(media >25 && media < 40){
				System.out.println("Turma adulta");
			}
			else{
				System.out.println("Turma véia");
			}
		}
	
		entrada.close();
		
	}

}
