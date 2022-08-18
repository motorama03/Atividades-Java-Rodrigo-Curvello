import java.util.Scanner;

public class AtividadeSete {
	
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 números");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número");
		int num2 = entrada.nextInt();
		
		System.out.println("Digite o último número");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3){
			if (num2 > num3){
				System.out.println("O maior "+ num1 +" em seguida "+ num2 +" "+ num3);
			}
			else{
				System.out.println("O maior "+ num1 +" em seguida "+ num3 +", "+ num2);
			}
		}
		if (num1 < num2 && num2 > num3 ){
			if (num1 > num3){
				System.out.println("O maior "+ num2 +" em seguida "+ num1 +" "+ num3);
			}
			else{
				System.out.println("O maior "+ num2 +" em seguida "+ num3 +", "+ num1);
			}
		}
		if (num1 < num3 && num3 > num2 ){
			if (num1 > num2){
				System.out.println("O maior "+ num3 +" em seguida "+ num1 +" "+ num2);
			}
			else{
				System.out.println("O maior "+ num3 +" em seguida "+ num2 +", "+ num1);
			}
		}
		
		entrada.close();
		
	}	
}