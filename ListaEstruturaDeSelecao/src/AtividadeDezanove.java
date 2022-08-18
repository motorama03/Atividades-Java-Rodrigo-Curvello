import java.util.Scanner;

public class AtividadeDezanove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		boolean passa;
		passa = false;
		double delta;
		double X1;
		double X2;
		System.out.println("Equação de segundo grau eee");
		double A = entrada.nextDouble();
		
		if ( A == 0){
			System.out.println("A equação não é de segundo grau, programa encerrado!");
		}
		else{
			System.out.println("Informe o B");
			double B = entrada.nextDouble();
			System.out.println("Informe o valor de C");
			double C = entrada.nextDouble();
			passa = true;
			
			if (passa){
				delta = (B * B)+(-4 * A * C);
				if (delta < 0){
					System.out.println("O delta deu negativo! programa encerrado!");
				}
				else{
					X1 = (-B + (Math.sqrt(delta))) / 2 * A ;
					X2 = (-B - (Math.sqrt(delta))) / 2 * A ;
				
					if (delta == 0){
						System.out.println("Delta = a 0 seu x é igual a "+ X1);
					}
					else{
						System.out.println("Seu x1 deu "+ X1 +" e seu x2 deu "+ X2);
					}
				}
			}
		}		
	
		entrada.close();
		
	}

}
