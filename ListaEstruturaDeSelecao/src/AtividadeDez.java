import java.util.Scanner;

public class AtividadeDez {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite outro número");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite mais um número");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println("O "+ num1 +" é o maior valor!");
			if (num2 > num3){
				System.out.println("O "+ num3 + " é o menor valor." );
			}
			else{
				System.out.println("O "+ num2 + " é o menor valor");
			}
		}
		else{
			if (num2 > num3 && num2 > num1){
				System.out.println("O "+ num2 +" é o maior valor!");
				if (num1 > num3){
					System.out.println("O "+ num3 + " é o menor valor." );
				}
				else{
					System.out.println("O "+ num1 + " é o menor valor");
				}
			}
			else{
				if (num3 > num2 && num3 > num1){
					System.out.println("O "+ num3 +" é o maior valor!");
					if (num2 > num1){
						System.out.println("O "+ num1 + " é o menor valor." );
					}
					else{
						System.out.println("O "+ num2 + " é o menor valor");
					}
				}
			}
		}
	
		entrada.close();
		
	}	
	}