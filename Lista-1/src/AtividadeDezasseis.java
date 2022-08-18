import java.util.Scanner;

public class AtividadeDezasseis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos metros quadrados serão pintados: ");
		double metrosq = entrada.nextDouble();
		
		double totalLitros;
		double totalLatas;
		double totalGalao;
		double totalPagar;
		double totalPagarGalao;
		
		totalLitros = metrosq / 6;
		totalLatas = totalLitros / 18;
		totalGalao = totalLitros / 3.6;
		totalPagar = totalLatas * 80;
		totalPagarGalao = totalGalao * 25;
				
		System.out.println("Total de litros: "+ totalLitros);
		System.out.println("Total de latas: "+ totalLatas);
		System.out.println("Total de galão: "+ totalGalao);
		System.out.println("A pintura com latas custará aproximadamente " + totalPagar);
		System.out.println("A pintura com galões custará aproximadamente " + totalPagarGalao);
		
		entrada.close();
		
	}


		
	}


