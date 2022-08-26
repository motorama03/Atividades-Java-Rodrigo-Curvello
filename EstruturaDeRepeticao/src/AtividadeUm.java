import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma nota entre 0 e 10!");
		float nota = entrada.nextFloat();
		
		do{
			System.out.println("Escreva um valor VÁLIDO!!!");
			nota = entrada.nextFloat();
		}while(nota > 10 || nota < 0);
		
		System.out.println("Você deu "+nota+" para o professor Rodrigo Curvello O-O");
	
		entrada.close();
		
	}
	
}
