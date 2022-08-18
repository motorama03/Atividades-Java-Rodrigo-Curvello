import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quatro notas");
		System.out.print("Primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.println("Segunda nota: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Terceira nota: ");
		float nota3 = entrada.nextFloat();
		System.out.println("Quarta nota: ");
		float nota4 = entrada.nextFloat();
		float media;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A média é de :"+ media);
		
		entrada.close();
		


	}

}
