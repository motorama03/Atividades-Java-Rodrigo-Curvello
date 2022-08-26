import java.util.Scanner;

public class AtividadeNove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num2;
		num2 = 0;
		
		System.out.println("Qual taboada você deseja?");
		int num1 = entrada.nextInt();
		
		for(int i = 0; i <= 10; i++){
			num2 = i * num1;
			System.out.println(num1+" X "+i+" = "+num2);
		}
		
		entrada.close();
		
	}

}
