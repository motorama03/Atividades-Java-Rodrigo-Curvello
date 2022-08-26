import java.util.Scanner;

public class AtividadeVinte {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe 0 para cancelar a digitação das notas!");
		int x;
		x = 1;
		boolean passa;
		passa = true;
		int notasdig;
		notasdig = 0;
		double media;
		media = 0;
		double notas;
		notas = 0;
		
			while(passa){
				System.out.println("Digite 1 para continuar ou 0 para sair");
				x = entrada.nextInt();
				if (x == 1){
					notasdig = notasdig + 1;
					System.out.println("Digite uma nota");
					double nota = entrada.nextDouble();
					notas = nota + notas;
				}
				else{
					media = notas / notasdig; 
					System.out.println("A média aritimeticas das notas é de: "+ media);
					passa = false;
				}
			}
		
			entrada.close();
			
	}

}
