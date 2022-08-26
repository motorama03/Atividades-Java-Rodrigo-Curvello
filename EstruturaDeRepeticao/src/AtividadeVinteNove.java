import java.util.Scanner;

public class AtividadeVinteNove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe qual taboada voc� deseja: ");
		int taboada = entrada.nextInt();
		
		System.out.println("A partir de que n�mero voc� deseja come�ar?");
		int inicio = entrada.nextInt();
		
		System.out.println("N�mero final: ");
		int fim = entrada.nextInt();
		
		int resultado;
		resultado = 0;
		
		int simulacra;
		simulacra = 0;
		
		if (inicio > fim){
			simulacra = inicio;
			inicio = fim;
			fim = simulacra;
		}
		
		for (int x = inicio; x <= fim; x++){
			resultado = x * taboada;
			System.out.println(taboada +" * "+x+" = "+resultado);
		}
			
		entrada.close();
		
	}

}
