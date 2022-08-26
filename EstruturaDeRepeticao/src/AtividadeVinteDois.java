import java.util.Scanner;

public class AtividadeVinteDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos candidatos vão votar?");
		int participantes = entrada.nextInt();
		System.out.println("Em qual candidato você deseja votar?");
		System.out.println("Candidato: 1, Candidato: 2, Candidato: 3 ?");
		int escolha = entrada.nextInt();
		int candidato1;
		candidato1 = 0;
		int candidato2;
		candidato2 = 0;
		int candidato3;
		candidato3 = 0;
		
		for(int x = 1; x <= participantes; x++){
			System.out.println("Em qual candidato você deseja votar?");
			System.out.println("Candidato: 1, Candidato: 2, Candidato: 3 ?");
			escolha = entrada.nextInt();
				while (escolha != 1 && escolha != 2 && escolha != 3){
					System.out.println("Em qual candidato você deseja votar?");
					System.out.println("Candidato: 1, Candidato: 2, Candidato: 3 ?");
					escolha = entrada.nextInt();
				}
			if (escolha == 1){
				candidato1 = candidato1 + 1;
			}
			else{
				if(escolha == 2){
					candidato2 = candidato2 + 1;
				}
				else{
					candidato3 = candidato3 + 1;
				}
			}
		}
		
		if ( candidato1 > candidato2 && candidato1 > candidato3){	
			System.out.println("candidato1 Venceu!");
		}
		else{
			if ( candidato2 > candidato3 && candidato1 < candidato2){	
				System.out.println("candidato2 Venceu!!");
			}
			else{
				if ( candidato3 > candidato2 && candidato3 > candidato1){	
					System.out.println("candidato3 Venceu!!!");
				}
				System.out.println("Tivemos um empate");
			}
		}
		entrada.close();
	}

}
