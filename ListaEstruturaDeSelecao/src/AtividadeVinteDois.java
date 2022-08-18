import java.util.Scanner;

public class AtividadeVinteDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número menor que 1000");
		int num = entrada.nextInt();
		
		double dezena;
		double centena;
		double unidade;
		double teste;
		
		if (num >= 1000){
			System.out.println("Valor inválido!");
		}
		else{
			if ((num % 100) > 0.9){
				teste = num % 100;
				centena = ((num % 1000)- teste)/100;
				dezena = (num % 100)/ 10;
				unidade = (num - centena*100 )- dezena*10;
				System.out.println("centena "+ centena +" dezena "+ dezena + " unidade "+ unidade);
				if (((num - dezena)% 10)> 0.9){
					dezena = (num - dezena)% 10;
					unidade = (num - (centena - dezena));
					
				}
			}
		}
	
		entrada.close();
		
	}
}
