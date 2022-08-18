import java.util.Scanner;

public class AtividadeDose {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua altura em metros! ");
		double altura = entrada.nextDouble();
		
		double pesoidemulher;
		double pesoide;
		pesoide = (72.7 * altura)- 58;
		pesoidemulher = (62.1 * altura)- 44.7;
		System.out.println("Seu peso ideal caso seja homem é de: "+ pesoide +"Kg !");
		System.out.println("Seu peso ideal caso seja mulher é de: "+ pesoidemulher +"Kg !");
		
		entrada.close();
		
	}

}