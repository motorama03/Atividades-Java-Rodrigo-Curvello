import java.util.Scanner;

public class AtividadeTreze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número!");
		int num = entrada.nextInt();
		
		int fim;
		int termino;
		termino = num;
		fim = 1;
		float resultado;
		resultado = num;
		
		while (termino != fim){
			termino = termino - 1;
			resultado = (resultado * termino);
		}
		
		System.out.println(resultado);
	
		entrada.close();
		
	}

}
