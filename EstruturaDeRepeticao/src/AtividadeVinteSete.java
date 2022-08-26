import java.util.Scanner;

public class AtividadeVinteSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double valorT;
		valorT = 0;
		float valor;
		valor = 1;
		boolean passa;
		passa = true;
		int escolha;
		escolha = 1;
		float dinheiroC;
		dinheiroC = 0;
		while (passa){
			System.out.println("-----Próximo cliente-----");
			while (valor != 0){
					System.out.println("Digite o valor");
					valor = entrada.nextFloat();
					valorT = valorT + valor;
			}
			System.out.println("O valor da compra foi: "+ (valorT-1));
			System.out.println("Quantos você pagará?");
			dinheiroC = entrada.nextFloat();
			System.out.println("Troco de "+(dinheiroC - valorT));
			System.out.println("");
			System.out.println("Deseja encerrar o processo?");
			System.out.println("Informe 1 para continuar ou outra coisa para encerrar.");
			escolha = entrada.nextInt();
			if(escolha != 1){
				passa = false;
			}
			else{
				valor = 1;
				valorT = 0;
			}
		}
		
		entrada.close();
		
	}

}
