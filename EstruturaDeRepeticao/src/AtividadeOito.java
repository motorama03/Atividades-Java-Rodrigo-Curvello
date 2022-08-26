import java.util.Scanner;

public class AtividadeOito {

	public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int num1 = entrada.nextInt();
		System.out.println("Informe outro número inteiro");
		int num2 = entrada.nextInt();
		int num3;
		int soma;
		
		if(num1 < num2){
			num3 = num2;
			num2 = num1;
			num1 = num3;
		}
		int x;
		
		soma = num1 + num2;
		
		for(x = num2; x <= num1; x++){
			System.out.print(x+ " - ");
		}
		
		System.out.println("A soma dos valores digitos é de "+ soma);
		
		entrada.close();
		
	}

}
