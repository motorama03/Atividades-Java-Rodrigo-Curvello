import java.util.Scanner;

public class AtividadeVinteSeis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		double num = entrada.nextDouble();
		
		if(num % 2 == 0 || num % 3 == 0){
			System.out.println(num +" � inteiro");
		}
		else{
			System.out.println(num + " � decimal");
		}
	
		entrada.close();
		
	}

}
