import java.util.Scanner;

public class AtividadeTrintaSete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem vindo ao question�rio de conhecimentos gerais");
		boolean passa = true;
		int acertos = 0;
		char resposta;
		
		while (passa){
			System.out.println("Quest�o 1: Quem � o atual presidente do Brasil");
			System.out.println("Resposta: A) Bolsonaro, B) Lula, C)Dilma ou D)Jo�o D�ria?");
			resposta = entrada.next().charAt(0);
			
			if (resposta == 'A' || resposta == 'a'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 2: Qual mat�ria prima foi usada na cria��o da arca de no�");
			System.out.println("Resposta: A)Ferro, B)Lenha, C)Pedra, D)Todas, E)A primeira?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'B' || resposta == 'b'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 3: Quantas letras tem o alfabeto?");
			System.out.println("Resposta: A)27, B)25, C)23, D)24, E)22?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'C' || resposta == 'c'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 4: Com quantos paus se fazem uma canoa?");
			System.out.println("Resposta: A)1, B)2, C)4, D)5+ E)Nenhuma?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'D' || resposta == 'd'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 5: Qual o plural de Junior?");
			System.out.println("Resposta: A)Jamile, B)Jurandir?, C)Juninhos, D)Junions, E)Junior's?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'E' || resposta == 'e'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 6: Quem colocou melon no gol?");
			System.out.println("Resposta: A)Junions, B)Jurandir, C)Jenifer, D)Vit�ria, E)Jo�o?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'E' || resposta == 'e'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 7: Qual dessas modas � do Ti�o Carrero??");
			System.out.println("Resposta: A)Chorei de saudade, B)Lembran�as, C)Meteoro, D)Ca�ador E)Dois Cora��es?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'D' || resposta == 'd'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 8: De quantos filhos a gr�vidade Taubat� estava?");
			System.out.println("Resposta: A)7, B)3, C)Nenhum, D)4, E)2?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'C' || resposta == 'c'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 9: A quantos anos jesus morreu?");
			System.out.println("Resposta: A)2022 A.c, B)2022, C)100, D)2002, E)Jesus never die?");
			resposta = entrada.next().charAt(0);
			
			if(resposta == 'B' || resposta == 'b'){
				acertos = acertos + 1;
			}
			
			System.out.println("Quest�o 10: Qual maneira de morrer � mais humilhante no cs?");
			System.out.println("Resposta: A)Faca, B)Hs eagle, C)Zeus D)Queda?");
			resposta = entrada.next().charAt(0);
			
			if (resposta == 'A' || resposta == 'a'){
				acertos = acertos + 1;
			}
			
			passa = false;
			
		}
		System.out.println("Sua reputa��o foi de: "+acertos);
		System.out.println("Deseja saber as alternativas corretas? (s para sim)");
		resposta = entrada.next().charAt(0);
		
		if(resposta == 's'){
			System.out.println("1.A, 2.B, 3.C, 4.D, 5.E, 6.E, 7.D, 8.C, 9.B, 10.A");
		}
		
		System.out.println("");
		System.out.println("Obrigado pela participa��o");
	
	entrada.close();
		
	}

}
