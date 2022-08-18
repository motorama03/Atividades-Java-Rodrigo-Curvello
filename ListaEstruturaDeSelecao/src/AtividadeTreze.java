import java.util.Scanner;

public class AtividadeTreze {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora trabalhada?");
		double hora = entrada.nextDouble();
		
		System.out.println("Quantas horas por mês você trabalha?");
		double horames = entrada.nextDouble();
		
		double salariobruto;
		double sindicato;
		double inss;
		double salarioliquido;
		
		salariobruto = (hora * horames);
		if (salariobruto < 901){
			System.out.println("Isento de impostos de renda");
			inss = salariobruto*0.0;
			sindicato = (salariobruto*0.03);	
			salarioliquido = (salariobruto - (inss + sindicato));
			System.out.println("Desconto INSS: "+inss);
			System.out.println("Desconto sindicato: "+sindicato);
			System.out.println("Salário liquido: "+salarioliquido);
			
		}
		else{
			if (salariobruto > 900 && salariobruto < 1501){
				System.out.println("Desconto de 5%");
				inss = salariobruto*0.05;
				sindicato = (salariobruto*0.03);	
				salarioliquido = (salariobruto - (inss + sindicato));
				System.out.println("Desconto INSS: "+inss);
				System.out.println("Desconto sindicato: "+sindicato);
				System.out.println("Salário liquido: "+salarioliquido);
				
			}
			else{
				if (salariobruto > 1500 && salariobruto < 2501){
					System.out.println("Desconto de 10%");
					inss = salariobruto*0.1;
					sindicato = (salariobruto*0.03);	
					salarioliquido = (salariobruto - (inss + sindicato));
					System.out.println("Desconto INSS: "+inss);
					System.out.println("Desconto sindicato: "+sindicato);
					System.out.println("Salário liquido: "+salarioliquido);
					
				}
			}
		}
	
		entrada.close();
		
	}

}
