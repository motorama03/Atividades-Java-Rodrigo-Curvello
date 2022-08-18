import java.util.Scanner;

public class AtividadeOito {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double hora = entrada.nextDouble();
		
		System.out.println("Agora informe quantas horas você trabalha por mês: ");
		double dia = entrada.nextDouble();
		
		double salario;
		salario = hora * dia;
		System.out.println("Você ganha " + salario + " por mês!");
		
		entrada.close();
		
	}

}
