import java.util.Scanner;

public class AtividadeVinteSete {
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dois numeros!");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double resultado;
		
		System.out.println("Escolha a opera��o, 1-div, 2-mult, 3-soma ou 4-subt");
		int escolha = entrada.nextInt();
		if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 ){
			System.out.println("Valor inv�lido!");
		}
		else{
			if (escolha == 1){
				resultado = num1 / num2;
			}
			else{
				if (escolha == 2){
					resultado = num1 * num2;
				}
				else{
					if(escolha == 3){
						resultado = num1 + num2;
					}
					else
						resultado = num1 - num2;
						}
					}
			
			if ((resultado % 2) == 0){
				System.out.println(resultado + " � par!");
			}
			else{
				System.out.println(resultado + "� impar!");
			}
			
			}
	
		entrada.close();
		
	}
	}
	

