import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Informe o segundo numero: ");
		int num2 = entrada.nextInt();
		num1 = num1 + num2;
		System.out.println("A soma dos numeros digitados é: " + num1);

		entrada.close();
		
	}

}
