import java.util.Scanner;

public class AtividadeTrinta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int cod;
		cod = 1;
		float altura;
		altura = 0;
		float Malto = 0;
		float Balto = 3.00f;
		float peso = 0;
		float Gpeso = 0;
		float Mpeso = 1000;
		
		do{
			System.out.println("Informe o código");
			cod = entrada.nextInt();
			
			System.out.println("Informe SUA ALTURA");
			altura = entrada.nextFloat();
			if(altura < Balto){
				Balto = altura;
			}
			if(altura > Malto){
				Malto = altura;
			}
			
			System.out.println("Informe seu PESO");
			peso = entrada.nextFloat();
			if(peso < Mpeso){
				Mpeso = peso;
			}
			if(peso > Gpeso){
				Gpeso = peso;
			}
			
		}
		while(cod != 0);
		
		System.out.println("O maior peso: "+Gpeso+" o menor peso: "+Mpeso);
		System.out.println("A maior altura: "+Malto+" a menor altura: "+Balto);
		
		entrada.close();
	}

}
