import java.util.Scanner;

public class AtividadeDez {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um inteiro base: ");
		int num1 = entrada.nextInt();
		System.out.println(" ");
		System.out.print("Agora informe um inteiro expoente: ");
		int num2 = entrada.nextInt();
		float R;
		int resultado;
		resultado = num1;
		
		for(R = 1; R != num2; R++){
			resultado = resultado * num1;
		}
		
		System.out.println(resultado);
		
		System.out.println();
	
		entrada.close();
		
	}

}
