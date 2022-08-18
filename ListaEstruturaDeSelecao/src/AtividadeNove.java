import java.util.Scanner;

public class AtividadeNove {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean passa;
		passa = true;
		
		while (passa) {
			System.out.println("Informe m para masculino e f para feminino");
			char sexo = entrada.next().charAt(0);
			double pesodeh;
			double pesodem;
			double pesot;
			
			if (sexo != 'm' && sexo != 'f'){
				passa = true; 
			}
			else{
				System.out.print("Informe a altura: ");
				double altura = entrada.nextDouble();
				
				System.out.println(" ");
				
				System.out.print("Informe o peso: ");
				double peso = entrada.nextDouble();	
				passa = false;
				
				System.out.println("Sexo: "+ sexo +" Altura: "+ altura +" Peso: "+peso);
				
				if (sexo == 'm'){
				pesodeh = peso/(altura * altura);
				pesot = pesodeh;
					if (pesodeh > 20 && pesodeh < 24.9){
						System.out.println("Seu peso está normal");	
					}
					else{
						System.out.println("Você está fora do peso!");	
					}
				}
				else{
					pesodem = peso/(altura * altura);
					pesot = pesodem;
						if ( pesodem > 19 && pesodem < 23.9){
							System.out.println("Seu peso está normal");	
						}
						else{
							System.out.println("Você está fora do peso!");	
						}
					
				}
				
				System.out.println("Seu peso ideal é de: "+ pesot);
				
			}
		}
		
		entrada.close();
		
	}

}
