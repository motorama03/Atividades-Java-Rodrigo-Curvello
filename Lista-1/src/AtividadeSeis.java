import java.util.Scanner;
public class AtividadeSeis {

	public static void main(String[] args) {
		java.util.Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o raio da circunferência");
		double raio = entrada.nextFloat();
		double PI;
		PI = 3.14;
		
		double area;
		area = PI * (2 * raio);
		
		System.out.println("A area da sua circunferencia e de: "+area);

		entrada.close();
		
	}

}
