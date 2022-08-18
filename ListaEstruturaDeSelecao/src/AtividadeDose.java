import java.util.Scanner;

public class AtividadeDose {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o sálario do colaborador!");
		double salariocolaborado = entrada.nextDouble();
		System.out.println("O salário antes do aumento é de "+ salariocolaborado);
		
		double percentual;
		double salariofinal;
		double valoraumento;
		
		if (salariocolaborado < 281){
			percentual = 20;
			valoraumento = (salariocolaborado * 0.2);
			salariofinal = (salariocolaborado + valoraumento);
			
			System.out.println("O percentual de "+ percentual +" resultou em um aumento de "+ valoraumento +" ficando o total de "+ salariofinal);
			
		}
		else{
			if (salariocolaborado > 280 && salariocolaborado < 701){
				percentual = 15;
				valoraumento = (salariocolaborado * 0.15);
				salariofinal = (salariocolaborado + valoraumento);
				
				System.out.println("O percentual de "+ percentual +" resultou em um aumento de "+ valoraumento +" ficando o total de "+ salariofinal);
				
			}
			else{
				if (salariocolaborado > 700 && salariocolaborado < 1501){
					percentual = 10;
					valoraumento = (salariocolaborado * 0.1);
					salariofinal = (salariocolaborado + valoraumento);
					
					System.out.println("O percentual de "+ percentual +" resultou em um aumento de "+ valoraumento +" ficando o total de "+ salariofinal);
					
				}
				else{
					if (salariocolaborado > 1500){
						percentual = 0.5;
						valoraumento = (salariocolaborado * 0.05);
						salariofinal = (salariocolaborado + valoraumento);
						
						System.out.println("O percentual de "+ percentual +" resultou em um aumento de "+ valoraumento +" ficando o total de "+ salariofinal);
						
					}
		}
		
	}

}
		
		entrada.close();
		
}
}