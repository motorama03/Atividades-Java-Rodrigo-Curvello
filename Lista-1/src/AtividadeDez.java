import java.util.Scanner;

public class AtividadeDez {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe dois numeros inteiro e um real");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		System.out.println("Agora informe o numero quebrado");
		double numq = entrada.nextDouble();
		
		double A;
		double B;
		double C;
		
		A = (2 * num1)+(num2/2);
		B = (3 * num1)+ numq;
		C = Math.pow(numq, numq);
		
		System.out.println("A resposta da a é: "+ A);
		System.out.println("A respota da b é de: "+ B);
		System.out.println("A resposta da C é de: "+ C);
		
		
		entrada.close();
		
		
	}

}
