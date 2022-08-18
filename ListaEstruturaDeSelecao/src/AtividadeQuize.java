import java.util.Scanner;

public class AtividadeQuize {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o custo e a origem do produto");
		System.out.print("Valor:");
		double valor = entrada.nextDouble();
		
		System.out.println("");
		System.out.println("Informe o código: ");
		
		System.out.println("Valor = "+valor);
		
		int dia = entrada.nextInt();
		if (dia == 1){
			System.out.println(" Sul");
		}
		else{
			if (dia == 2){
				System.out.println(" Norte!");
			}
			else{
				if (dia == 3){
					System.out.println(" Leste!");
				}
				else{
					if (dia == 4){
						System.out.println(" Oeste!");
					}
					else{
						if (dia == 5){
							System.out.println(" Nordeste!");
						}
						else{
							if (dia == 6){ 
								System.out.println(" Nordeste!");
							}
							else{
								if (dia == 7){
									System.out.println(" Centro-oeste");
								}
								else{
									if (dia == 8){
									System.out.println(" Centro-oeste");
									}
									else{
										System.out.println(" Importado");
								}
							}
						}
					}
				}
			}
		}
	}

		entrada.close();
		
}
		
}
