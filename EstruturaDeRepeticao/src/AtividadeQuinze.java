import java.util.Scanner;

public class AtividadeQuinze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Veja");
		//int num = entrada.nextInt();
		
		int num;
		num = 37;
		float resultado;
		resultado = 1;
		int multiplicador;
		multiplicador = 38;
		int divisor;
		divisor = 1;
		
		while (num >= 0){
			resultado = resultado +((num * multiplicador)/divisor);
			System.out.println(num+" x "+multiplicador+" / "+divisor);
			divisor = divisor + 1;
			num = num - 1;
			multiplicador = multiplicador - 1;
		}
		
		System.out.println(resultado);
		
		entrada.close();
	
	}

}
