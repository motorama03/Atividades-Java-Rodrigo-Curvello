import java.util.Scanner;

public class AtividadeVinteOito {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas temperaturas terei de calcular?");
		int todas = entrada.nextInt();
		
		float tempB;
		tempB = 999;
		float tempA;
		tempA = -999;
		float tempM;
		tempM = 0;
		float temperatura;
		
		for(int x = 1; x <= todas; x++){
			System.out.println("Informe a temperatura");
			temperatura = entrada.nextFloat();
			tempM = temperatura + tempM;
			if(temperatura < tempB){
				tempB = temperatura;
			}
			if(temperatura > tempA){
				tempA = temperatura;
			}
		}
		tempM = tempM / todas;
		System.out.println(tempA+" é a temperatura mais alta, "+tempB+" é a temperatura mais baixa");
		System.out.println("E a média da temperatura é de "+tempM);
		
		entrada.close();
	}

}
