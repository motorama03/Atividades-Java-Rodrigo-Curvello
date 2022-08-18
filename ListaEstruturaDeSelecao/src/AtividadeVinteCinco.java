import java.util.Scanner;

public class AtividadeVinteCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos reais você d eseja sacar?");
		double saque = entrada.nextDouble();
		
		//double teste;
		//double nota1;
		//double nota5;
		//double nota10;
		double nota20;
		double nota50;
		double nota100;
		//boolean passa;
		//passa = true;
		
			nota100 = (saque -(saque % 100))/ 100;
			if (nota100 > 0.9){
				System.out.println(nota100 + " notas de 100");
			} 
			nota50 = (saque -(nota100 * 100))/ 50;
			if (((saque -(nota100 * 100))/ 50)> 0.9){
				System.out.println(nota50 + " notas de 50");
			}
			nota20 = ((saque - (((nota100 * 100) + nota50 *50)))/20);
			if ((saque - (((nota100 * 100) + nota50 *50)))/20> 0.9){
				System.out.println(nota20 + " notas de 20");
			}
		entrada.close();
		}
		
	}


