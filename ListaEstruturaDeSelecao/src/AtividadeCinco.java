import java.util.Scanner;

public class AtividadeCinco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite uma letra");
		char vogal = entrada.next().charAt(0);
		
		if (vogal == 'a' || vogal == 'A'){
			System.out.println("Vogal a!");
		}
		else{
			if (vogal == 'e' || vogal == 'E'){
				System.out.println("Vogal e!");
			}
			else{
				if (vogal == 'i' || vogal == 'I'){
					System.out.println("Vogal i!");
				}
				else{
					if (vogal == 'o' || vogal == 'O'){
						System.out.println("Vogal o!");
					}
					else{
						if (vogal == 'u' || vogal == 'U'){
							System.out.println("Vogal u!");
						}
						else{
							System.out.println("Caractere inválido!!!");
						}
					}
				}
			}
		}
	
		entrada.close();
		
	}

}
