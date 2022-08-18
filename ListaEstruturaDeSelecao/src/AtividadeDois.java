import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro");
		int num1 = entrada.nextInt();
		
		if (num1 > 0){
			System.out.println("O valor "+ num1 + " é positivo!");
		}
		else{
			if (num1 < 0){
				System.out.println("O valor "+ num1 +" é negativo!");
			}
			else{
				System.out.println("O valor digitado é igual a 0!");
			}
		}
		
		entrada.close();
		
	}

}
