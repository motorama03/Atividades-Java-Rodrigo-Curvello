import java.util.Scanner;

public class AtividadeVinteCinco2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		int num = entrada.nextInt();
		
		if ((num % 2)== 0){
			System.out.println(num + " � numero par");
		}
		else{
			System.out.println(num + " � numero impar");
		}
		
		entrada.close();
		
	}

}
