import java.util.Scanner;

public class AtividadeQuatorze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe até que número você deseja dividir!");
		int num = entrada.nextInt();
		int divisao;
		divisao = 1;
		//double resultado;
		//resultado = 1;
		int n;
		n = 1;
		
		while (n <= num){
			//resultado = (n / divisao);
			System.out.println(n+"/"+divisao);
			n = n + 1;
			divisao = divisao + 2;
		}
		
		
		entrada.close();
		
	}

}
