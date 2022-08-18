import java.util.Scanner;

public class AtividadeDezessete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota do aluno");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Informe a segunda nota do aluno");
		double nota2 = entrada.nextDouble();
		
		char mediaaproveitamento;
		
		double media;
		media = (nota1 + nota2)/ 2;
		
		if (media < 4.1){
			mediaaproveitamento = 'E';
			System.out.println("O aluno recebeu média = "+ mediaaproveitamento +" Logo o aluno está REPROVADO!");
		}
		else{
			if (media > 4 && media < 6){
				mediaaproveitamento = 'D';
				System.out.println("O aluno recebeu média = "+ mediaaproveitamento +" Logo o aluno está REPROVADO!");
			}
			else {
				if (media > 5.9 && media <7.5){
					mediaaproveitamento = 'C';
					System.out.println("O aluno recebeu média = "+ mediaaproveitamento +" Logo o aluno está APROVADO!");
				}
				else {
					if (media > 7.5 && media < 9){
						mediaaproveitamento = 'B';
						System.out.println("O aluno recebeu média = "+ mediaaproveitamento +" Logo o aluno está APROVADO!");
					}
					else {
						if (media > 9){
							mediaaproveitamento = 'A';
							System.out.println("O aluno recebeu média = "+ mediaaproveitamento +" Logo o aluno está APROVADO!");
						}
						}
					}
				}
			}
		
			entrada.close();
		
		
			}
		}
