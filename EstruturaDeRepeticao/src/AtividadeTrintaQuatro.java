import java.util.Scanner; 

public class AtividadeTrintaQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int media0_25 = 0;
		int media0_50 = 0;
		int media0_75 = 0;
		int media0_100 = 0;
		int valor;
		valor = 0;
		
		do{
			System.out.println("Informe um número inteiro até 100, ou um negativo para sair!");
			valor = entrada.nextInt();
			
			if(valor > 0 && valor <= 25){
				media0_25 = media0_25 + 1;
			}
			else{
				if(valor > 25 && valor <= 50){
					media0_50 = media0_50 + 1;
				}
				else{
					if(valor > 50 && valor <= 75){
						media0_75 = media0_75 + 1;
					}
					else{
						if(valor > 75 && valor <= 100){
							media0_100 = media0_100 + 1;
						}
						else{
							if(valor < 0){
								System.out.println("Obrigado!");
							}
							else{
							System.out.println("Valor inválido!!!");
							}
						}
					}
				}
			}
		}
		while(valor >= 0);
		
		System.out.println("Quantidade numeros entre 0 e 25: "+media0_25);
		System.out.println("Quantidade numeros entre 25 e 50: "+media0_50);
		System.out.println("Quantidade numeros entre 50 e 75: "+media0_75);
		System.out.println("Quantidade numeros entre 75 e 100: "+media0_100);
		
		entrada.close();
		
	}

}
