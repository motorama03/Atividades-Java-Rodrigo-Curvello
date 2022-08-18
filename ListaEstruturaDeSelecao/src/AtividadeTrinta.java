import java.util.Scanner;

public class AtividadeTrinta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		boolean passa;
		passa = true;
		double valorT;
		valorT = 0;
		double pesoT;
		pesoT = 0;
		while (passa){
			System.out.println("Digite 1 para prosseguir ou 2 para sair");
			int continuar = entrada.nextInt();
			if (continuar == 1){
				System.out.println("Informe que fruta você deseja comprar, 1- Morango, 2-Maçã");
				int escolha = entrada.nextInt();
				if (escolha != 1 && escolha != 2){
					System.out.println("Valor Inválido!");
				}
				else{
					if (escolha == 1){
						System.out.println("Quantos kg de morango você deseja?");
						double Kmorango = entrada.nextDouble();
						if (Kmorango > 0 && Kmorango <= 5){
							pesoT = pesoT + Kmorango;
							valorT = valorT + (Kmorango * 2.5);
						}
						else{
							if (Kmorango > 5){
								pesoT = pesoT + Kmorango;
								valorT = valorT + (Kmorango * 2.2);
							}
							else{
								System.out.println("Digite um valor positivo para K");
							}
						}
					}
					else{
						if (escolha == 2){
							System.out.println("Quantos kg de maçã você deseja?");
							double Kmaca = entrada.nextDouble();
							if (Kmaca > 0 && Kmaca <= 5){
								pesoT = pesoT + Kmaca;
								valorT = valorT + (Kmaca * 1.8);
							}
							else{
								if (Kmaca > 5){
									pesoT = pesoT + Kmaca;
									valorT = valorT + (Kmaca * 1.5);
								}
								else{
									System.out.println("Digite um valor positivo para K");
								}
							}
						}
						else{
							System.out.println("Valor inválido!!!");
						}
					}
				}
			}
			else{
				if (continuar == 2){
				System.out.println("Obrigado por acessar o sistema!");
				passa = false;
				if (pesoT > 25){
					valorT = valorT - (valorT * 0.10);
				}
				System.out.println("Conta final: "+ valorT);
			}
				else{
					System.out.println("Valor inválido!");
				}
			}
		}
	
		entrada.close();
		
	}

}
