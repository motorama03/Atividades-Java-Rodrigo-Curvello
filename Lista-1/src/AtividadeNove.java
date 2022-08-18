import java.util.Scanner;

public class AtividadeNove {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temp. em graus Farenheit: ");
		double temp = entrada.nextFloat();
		
		double conversao;
		conversao = (temp - 32)/1.8;
		System.out.println("A temperatura convertida equivale há: " + conversao + "ºC");
		
		entrada.close();
		
	}

}
