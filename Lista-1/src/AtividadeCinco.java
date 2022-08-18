import java.util.Scanner;

public class AtividadeCinco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em metros que você queira converter para cm");
		float metros = entrada.nextFloat();
		
		float cm;
		cm = metros * 100;
		System.out.println(metros + "Convertido para cm fica: " + cm +"cm");

		entrada.close();
		
	}

}
