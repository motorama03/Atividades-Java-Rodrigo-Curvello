import java.util.Scanner;

public class AtividadeDeznove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero! ");
		int num = entrada.nextInt();
		int x;
		x = 1;
		int primos;
		primos = 0;
		
		do{
			x = x + 1;
			if (x % 2 == 0 || x % 3 == 0){
				
			}
			else {
				System.out.println(x +" � primo");
				primos = primos + 1;
			}
		}
		while (x != num);
		
		System.out.println("Temos "+primos+" n�meros primos!");
		
		entrada.close();
		
	}

}
