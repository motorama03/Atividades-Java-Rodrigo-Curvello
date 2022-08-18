import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um ano");
		double ano = entrada.nextDouble();
		
		if (ano % 4 == 0){
			System.out.println(ano +" é bisexto!");
		}
		else{
			System.out.println(ano + " Não é bisexto!");
		}
		
	entrada.close();
		
	}
}
