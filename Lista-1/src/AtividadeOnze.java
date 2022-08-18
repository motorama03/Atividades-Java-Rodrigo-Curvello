import java.util.Scanner;

public class AtividadeOnze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua altura em metros! ");
		double altura = entrada.nextDouble();
		
		double pesoide;
		pesoide = (72.7 * altura)- 58;
		System.out.println("Seu peso ideal é de: "+pesoide +"Kg !");
		
		entrada.close();
		
	}

}
