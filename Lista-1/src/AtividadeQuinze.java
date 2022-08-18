import java.util.Scanner;

public class AtividadeQuinze {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos metros quadrados serão pintados: ");
		double metrosq = entrada.nextDouble();
		
		double totalLitros;
		double totalLatas;
		double totalPagar;
		
		totalLitros = metrosq / 3;
		totalLatas = totalLitros / 18;
		totalPagar = totalLatas * 80;
				
		System.out.println("Total de litros: "+ totalLitros);
		System.out.println("Total de latas: "+ totalLatas);
		System.out.println("A pintura custará aproximadamente " + totalPagar);
		
		entrada.close();
		
	}

}
