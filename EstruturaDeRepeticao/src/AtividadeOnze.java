import java.util.Scanner;

public class AtividadeOnze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		int numerospar;
		numerospar = 0;
		int numerosimpar;
		numerosimpar = 0;
		
		System.out.println("Informe números!");
		for(int x = 1; x <= 10; x++){
			num = entrada.nextInt();
			if (num % 2 == 0){
				numerospar = numerospar + 1;
			}
			else{
				numerosimpar = numerosimpar + 1;
			}
		}
	
		System.out.println("Numeros pares= "+numerospar+" numeros impares= "+numerosimpar);
		
		entrada.close();
		
	}

}
