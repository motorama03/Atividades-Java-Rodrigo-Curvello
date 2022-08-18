import java.util.Scanner;

public class AtividadeDezoito {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os lados de um triângulo");
		double lado1 = entrada.nextDouble();
		
		System.out.println("Informe o segundo lado do triângulo");
		double lado2 = entrada.nextDouble();
		
		System.out.println("Informe o terceiro lado do triângulo");
		double lado3 = entrada.nextDouble();
		
		boolean passa;
		passa = true;
		
		if (lado1 + lado2 > lado3){
			passa = false;
		}
		if (lado2 + lado3 > lado1){
			passa = false;
		}
		if (lado3 + lado1 > lado2){
			passa = false;
		}
		
		if (!passa){
			if (lado1 == lado2 && lado2 == lado3){
				System.out.println("O Triângulo é Equilátero!");
			}
			else{
				if (lado1 == lado2 && lado2 != lado3){
					System.out.println("O Triângulo é Isósceles!");
				}
				else{
					if (lado2 == lado3 && lado2 != lado1){
						System.out.println("O Triângulo é Isósceles!");
					}
					else{
						if (lado1 == lado3 && lado1 != lado3){
							System.out.println("O Triângulo é Isósceles!");
						}
						else{
							System.out.println("O Triângulo é Escaleno!");
						}
							
					}
				}
			}
		}
	
		entrada.close();
		
	}
}
