import java.util.Scanner;

public class AtividadeOnze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite M para matutino, N para noturno ou V para vespertino");
		char turno = entrada.next().charAt(0);
		
		if (turno == 'M'){
			System.out.println("Bom dia!");
		}
		else{
			if (turno == 'V'){
				System.out.println("Boa tarde!");
			}
			else{
				System.out.println("Boa noite!");
			}
		}
		
		entrada.close();
		
	}

}
