import java.util.Scanner;

public class AtividadeVinteSeis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos pães o cliente comprou? ");
		int quantidade = entrada.nextInt();
		double totalcompra;
		totalcompra = 0;
		
		totalcompra = (quantidade * 0.18);
		
		System.out.println("A compra custou: "+(totalcompra-(quantidade / 100)));
		System.out.println("Obrigado volte sempre!");
		entrada.close();
		
		entrada.close();
		
	}


}
