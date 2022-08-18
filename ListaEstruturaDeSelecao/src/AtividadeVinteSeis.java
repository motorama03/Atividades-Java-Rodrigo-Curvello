import java.util.Scanner;

public class AtividadeVinteSeis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número");
		double num = entrada.nextDouble();
		
		if(num % 2 == 0 || num % 3 == 0){
			System.out.println(num +" é inteiro");
		}
		else{
			System.out.println(num + " é decimal");
		}
	
		entrada.close();
		
	}

}
