import java.util.Scanner;

public class AtividadeSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um lado de um quadrado: ");
		double area = entrada.nextDouble();
		area = area * area;
		
		System.out.println("A �rea do seu quadrado corresponde a: " + area);
		
		entrada.close();
		
	}

}
