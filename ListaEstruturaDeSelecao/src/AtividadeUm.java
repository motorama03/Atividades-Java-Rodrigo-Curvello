import java.util.Scanner;

public class AtividadeUm {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero");
		int num2 = entrada.nextInt();
		
		if (num1 > num2){
			System.out.println("O "+ num1 +" � o maior valor!");
		}
		else{
			if (num1 < num2){
				System.out.println("O "+ num2 +" � o maior valor!");
			}
			else{
				System.out.println("Os dois valores s�o iguais!");
			}
		}

		entrada.close();
		
	}

}
