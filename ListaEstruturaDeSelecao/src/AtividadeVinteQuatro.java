import java.util.Scanner;

public class AtividadeVinteQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe nota1");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Informe nota2");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Informe nota3");
		double nota3 = entrada.nextDouble();
		
		double media;
		media = (nota1 + nota2 + nota3) /3;
		if(media == 10){
			System.out.println("Aprovado com distinção");
		}
		else{
		if (media > 7 && media != 10 ){
			System.out.println("Parabéns APROVADO");
		}
		else{
			System.out.println("REPROVADO");
		}
		
	}

		entrada.close();
		
}
}
