import java.util.Scanner;

public class AtividadeDezasseis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro!");
		int num = entrada.nextInt();
		
		System.out.println("Agora outro");
		int num2 = entrada.nextInt();
		
		int soma;
		
		if (num < num2){
			System.out.println("Maior valor "+num2+" e menor valor "+ num);
		}
		else{
			if(num == num2){
				System.out.println("Ambos valores s�o iguals");
			}
			else{
				System.out.println("Maior valor "+num+" e menor valor "+ num2);
			}
		}
		
		soma = num + num2;
		System.out.println("A soma dos valores � de "+soma);
	
		entrada.close();
		
	}

}
