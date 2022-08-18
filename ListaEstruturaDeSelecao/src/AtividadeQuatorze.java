import java.util.Scanner;

public class AtividadeQuatorze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero referente a um dia da semana");
		System.out.println("Ex 1-Domingo, 2-Segunda...");
		int dia = entrada.nextInt();
		
		if (dia == 1){
			System.out.println("Domingou");
		}
		else{
			if (dia == 2){
				System.out.println("Segunda-feira!");
			}
			else{
				if (dia == 3){
					System.out.println("Terça-feira!");
				}
				else{
					if (dia == 4){
						System.out.println("Quarta-feira!");
					}
					else{
						if (dia == 5){
							System.out.println("Quinta-feira!");
						}
						else{
							if (dia == 6){
								System.out.println("Sexta-feira!");
							}
							else{
								if (dia == 7){
									System.out.println("Sabadoooo!");
								}
								else{
									System.out.println("VALOR INVÁLIDO!");
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
