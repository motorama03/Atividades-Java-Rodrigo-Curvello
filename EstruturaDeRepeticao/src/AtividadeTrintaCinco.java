import java.util.Scanner;

public class AtividadeTrintaCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os produtos que voc� deseja comprar a partir do c�digo deles: 100, 101, 102, 103, 104, 105.");
		float cachorro = 1.2f;
		float bauros = 1.3f;
		float bauroo = 1.5f;
		float hamburguer = 1.2f;
		float cheeseburguer = 1.3f;
		float redrigerante = 1;
		int qnt = 0;
		int cod = 1;
		float total = 0;
		
		while(cod != 0){
			System.out.print("Informe 0 para sair ou o codigo do produto voc� deseja comprar: ");
			cod = entrada.nextInt();
				while(cod != 0 && cod != 100 && cod != 101 && cod != 102 && cod != 103 && cod != 104 && cod != 105){
					System.out.println("C�digo inv�lido");
					cod = entrada.nextInt();
				}
			if (cod == 100){
				qnt = 0;
				System.out.println("Quantos cachorro's quente voc� deseja?");
				qnt = entrada.nextInt();
				total = total+(qnt * cachorro);
			}
			else{
				if (cod == 101){
					qnt = 0;
					System.out.println("Quantos bauru's simples voc� deseja?");
					qnt = entrada.nextInt();
					total = total+(qnt * bauros);
				}
				else{
					if (cod == 102){
						qnt = 0;
						System.out.println("Quantos bauru's com ovos voc� deseja?");
						qnt = entrada.nextInt();
						total = total+(qnt * bauroo);
					}
					else{
						if (cod == 103){
							qnt = 0;
							System.out.println("Quantos Hamburguer's voc� deseja?");
							qnt = entrada.nextInt();
							total = total+(qnt * hamburguer);
						}
						else{
							if (cod == 104){
								qnt = 0;
								System.out.println("Quantos cheeseburguer voc� deseja?");
								qnt = entrada.nextInt();
								total = total+(qnt * cheeseburguer);
							}
							else{
								if (cod == 105){
								qnt = 0;
								System.out.println("Quantos redrigerante's voc� deseja?");
								qnt = entrada.nextInt();
								total = total+(qnt * redrigerante);
							}
							}
						}
					}
				}
			}	
		}
		
		System.out.println("O valor total da compra � de: "+total);
		
		entrada.close();
		
	}

}
