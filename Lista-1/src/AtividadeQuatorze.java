import java.util.Scanner;

public class AtividadeQuatorze {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidad de horas trabalhadas no mês! ");
		double horasmes = entrada.nextDouble();
		
		System.out.println("Agora informe quanto você ganha por hora");
		double ganhohora = entrada.nextDouble();
		
		double salariob;
		salariob = horasmes * ganhohora;
		
		double ir;
		ir = salariob * 0.11;
		
		double inss;
		inss = salariob * 0.08;
		
		double sindicato;
		sindicato = salariob * 0.05;
		
		double salariol;
		salariol = salariob -(ir + inss + sindicato);
		
		System.out.println("Salário bruto = "+ salariob);
		System.out.println("Imposto de renda = "+ ir +" Inss = "+ inss +" Sindicato = "+ sindicato);
		System.out.println("Salário líquido = " + salariol);
		
		entrada.close();
		
	}

}
