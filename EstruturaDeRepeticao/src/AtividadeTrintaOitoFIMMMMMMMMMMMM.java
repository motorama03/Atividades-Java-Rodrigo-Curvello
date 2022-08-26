import java.util.Scanner;

public class AtividadeTrintaOitoFIMMMMMMMMMMMM {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número para inverter");
		int numeroInverte = entrada.nextInt();
        int numeroInvertido = 0;

        while (numeroInverte > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (numeroInverte % 10);
            numeroInverte = numeroInverte / 10;
		}
		System.out.println(numeroInvertido);
		
		entrada.close();
    }
}