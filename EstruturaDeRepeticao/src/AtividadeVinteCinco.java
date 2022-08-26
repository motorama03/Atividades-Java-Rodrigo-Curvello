import java.util.Scanner;

public class AtividadeVinteCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos produtos o cliente comprou? ");
		int quantidade = entrada.nextInt();
		int escolha;
		escolha = 0;
		double totalcompra;
		totalcompra = 0;
		
		for (int x = 1; x <= quantidade; x++){
			System.out.println("Qual dos produtos entre 1 e 50 o cliente comprou?");
			escolha = entrada.nextInt();
			while (escolha < 1 && escolha > 50){
				System.out.println("Não trabalhamos com este produto!");
				System.out.println("Qual dos produtos entre 1 e 50 o cliente comprou?");
				escolha = entrada.nextInt();
			}
			totalcompra = totalcompra + ( escolha * 1.99 );
			
		}
		
		System.out.println("A compra custou: "+totalcompra);
		System.out.println("Obrigado volte sempre!");
		entrada.close();
	}

}
