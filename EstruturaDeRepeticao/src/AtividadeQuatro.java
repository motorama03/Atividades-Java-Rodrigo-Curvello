import java.util.Scanner;

public class AtividadeQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float populacaoA;
		populacaoA = 80000;
		float populacaoB;
		populacaoB = 200000;
		int ano;
		ano = 0;
		
		while (populacaoA <= populacaoB){
			ano = ano + 1;
			populacaoB = populacaoB + (populacaoB * 0.015f);
			populacaoA = populacaoA + (populacaoA * 0.03f);
		}
		
		System.out.println("populacaoB: " + populacaoB + " populacaoA: "+ populacaoA);
		System.out.println("Em "+ano+" anos");
	
		entrada.close();
		
	}

}
