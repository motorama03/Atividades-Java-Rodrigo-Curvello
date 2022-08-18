import java.util.Scanner;

public class AtividadeTreze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos Kg João pescou? ");
		double peixes = entrada.nextDouble();
		
		double excesso;
		double multa;
		excesso = 50;
		if (peixes > excesso){
			excesso = peixes - 50;
			multa = excesso * 4;
			System.out.println("João excedeu o limite peso, valor da multa: "+ multa +"R$");
		}
		else{
			excesso = 0;
			multa = 0;
			System.out.println("Não será necessário pagar nada o valor da multa é de "+ multa);
			System.out.println("E o valor do excesso se tornou: " + excesso);
		}
		
		entrada.close();
		
	}

}
