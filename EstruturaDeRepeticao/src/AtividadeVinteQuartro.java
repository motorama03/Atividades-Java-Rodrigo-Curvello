import java.util.Scanner;

public class AtividadeVinteQuartro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos CD's voc� tem em sua cole��o?");
		int totalCD = entrada.nextInt();
		double preco;
		preco = 0;
		double totalvalor;
		totalvalor = 0;
		System.out.println("Informe quantos reais voc� pagou em cada um!");
		
		for (int x = 1; x <= totalCD; x++){
			
		System.out.print("Valor: ");	
		preco = entrada.nextDouble();
		System.out.println(" ");
		totalvalor = totalvalor + preco;
		
		}
		
		System.out.println("A media paga por CD � de "+(totalvalor / totalCD));
		System.out.println("O total de dinheiro investido � de "+ totalvalor);
		
		entrada.close();
		
	}

}
