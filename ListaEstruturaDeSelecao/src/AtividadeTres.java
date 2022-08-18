import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sexo 'M' ou 'F'");
		char sexo = entrada.next().charAt(0);
		
		switch (sexo){
			case 'M':
				System.out.println("Masculino");
			break;
				
			case 'F':
				System.out.println("Feminino");
			break;
			
			
		}
		if (sexo != 'M' && sexo != 'F'){
			System.out.println("Valor inválido!");
		}
	
		entrada.close();
		
	}
	
}
