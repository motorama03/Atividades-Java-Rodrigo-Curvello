import java.util.Scanner;

public class AtividadeDezasete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int num = entrada.nextInt();
		
		do{
			if(num % 2 == 0 || num % 3 == 0){
				System.out.println(num+" não é primo");
				num = entrada.nextInt();
			}
			else{
				System.out.println(num+" é primo!");
			}
		}
			while(num % 2 == 0 || num % 3 == 0);
		
		entrada.close();
		
	}
}
