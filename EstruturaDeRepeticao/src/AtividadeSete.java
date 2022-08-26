import java.util.Scanner;

public class AtividadeSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int num1 = entrada.nextInt();
		System.out.println("Informe outro número inteiro");
		int num2 = entrada.nextInt();
		int num3;
		
		if(num1 < num2){
			num3 = num2;
			num2 = num1;
			num1 = num3;
		}
		int x;
		
		
		for(x = num2; x <= num1; x++){
			System.out.print(x+ " - ");
		}
		
		entrada.close();
		
	}

}
