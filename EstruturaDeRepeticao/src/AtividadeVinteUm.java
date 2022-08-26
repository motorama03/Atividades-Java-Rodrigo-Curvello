import java.util.Scanner;

public class AtividadeVinteUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int escolha;
		escolha = 1;
		float media;
		media = 0;
		int vezes;
		vezes = 0;
		
		do{
			System.out.println("Informe a 1 para dizer a idade ou 0 para sair!");
			escolha = entrada.nextInt();
			
			if (escolha == 1){
				vezes = vezes + 1;
				System.out.println("Informe a idade");
				int idade = entrada.nextInt();
				media = media + idade;
				}
			else{
				System.out.println("Obrigado por usar nossos serviços :3");
			}
		}
		while(escolha == 1);
		media = media / vezes;
		
		if(media <= 25){
		System.out.println("A media do grupo de pessoas é jovem!");
		}
		else{
			if(media > 25 && media < 60){
				System.out.println("A media do grupo de pessoas é mid life");
			}
			else{
				System.out.println("véio");
			}
		}
		entrada.close();
	}

}
