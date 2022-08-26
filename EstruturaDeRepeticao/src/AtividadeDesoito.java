import java.util.Scanner;

public class AtividadeDesoito {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int num = entrada.nextInt();
		
		do{
			if(num % 2 == 0){
				System.out.println(num+" não é primo e é divisivel por 2!");
				num = entrada.nextInt();
			}
			else{
				if(num % 3 == 0){
					System.out.println(num+" não é primo e é divisivel por 3!");
					num = entrada.nextInt();
				}
				else{
				System.out.println(num+" é primo! e é divisivel por 1 e "+num);
			}
		}
		}
			while(num % 2 == 0 || num % 3 == 0);
		
		entrada.close();
		
	}
}