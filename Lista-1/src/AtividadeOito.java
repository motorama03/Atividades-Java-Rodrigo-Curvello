import java.util.Scanner;

public class AtividadeOito {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		double hora = entrada.nextDouble();
		
		System.out.println("Agora informe quantas horas voc� trabalha por m�s: ");
		double dia = entrada.nextDouble();
		
		double salario;
		salario = hora * dia;
		System.out.println("Voc� ganha " + salario + " por m�s!");
		
		entrada.close();
		
	}

}
