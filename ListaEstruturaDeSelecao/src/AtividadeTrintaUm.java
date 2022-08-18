import java.util.Scanner;

public class AtividadeTrintaUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double valorT;
		valorT = 0;
		
		System.out.println("Informe qual o tipo de carne voc^`e deseja comprar: 1-Filé-Duplo, 2-Alcatra, 3-Picanha");
		int escolha = entrada.nextInt();
		
		if(escolha == 1){
			System.out.println("Quantos quilos você deseja?");
			double qnt = entrada.nextDouble();
			if (qnt > 5){
				valorT = qnt * 5.8;
			}
			else{
				valorT = qnt * 4.9;
			}
			
			System.out.println("Deseja pagar com cartão, 1-Sim, 2-Não?");
			int cartao = entrada.nextInt();
			if (cartao == 1){
				valorT = valorT - (valorT * 0.05);
			}
			System.out.println("Valor total da compra: "+ valorT);
			
		}
		else{
			if(escolha == 2){
				System.out.println("Quantos quilos você deseja?");
				double qnt = entrada.nextDouble();
				if (qnt > 5){
					valorT = qnt * 6.8;
				}
				else{
					valorT = qnt * 5.9;
				}
				System.out.println("Deseja pagar com cartão, 1-Sim, 2-Não?");
				int cartao = entrada.nextInt();
				if (cartao == 1){
					valorT = valorT - (valorT * 0.05);
				}
				System.out.println("Valor total da compra: "+ valorT);
			
			}
			else{
				if(escolha == 3){
					System.out.println("Quantos quilos você deseja?");
					double qnt = entrada.nextDouble();
					if (qnt > 5){
						valorT = qnt * 7.8;
					}
					else{
						valorT = qnt * 6.9;
					}
					System.out.println("Deseja pagar com cartão, 1-Sim, 2-Não?");
					int cartao = entrada.nextInt();
					if (cartao == 1){
						valorT = valorT - (valorT * 0.05);
					}
					System.out.println("Valor total da compra: "+ valorT);
				}
			}
		}
	
		entrada.close();
		
	}

}
