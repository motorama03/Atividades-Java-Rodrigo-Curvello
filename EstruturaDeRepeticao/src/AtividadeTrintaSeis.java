import java.util.Scanner;

public class AtividadeTrintaSeis {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int candidato4 = 0;
		int nulos = 0;
		int brancos = 0;
		int voto;
		float tvotos = 0;
		do{
			System.out.println("Seu voto vai para. Marcela(1), Juliano(2), Rodrigo(3), André(4) ou 5 para nulos, caso não seja uma das opções seu voto será em branco!");
			voto = entrada.nextInt();
			tvotos = tvotos + 1;
			if (voto == 1){
				candidato1 = candidato1 + 1;
			}
			else{
				if(voto == 2){
					candidato2 = candidato2 + 1;
				}
				else{
					if(voto == 3){
						candidato3 = candidato3 + 1;
					}
					else{
						if(voto == 4){
							candidato4 = candidato4 + 1;
						}
						else{
							if(voto == 5){
								nulos = nulos + 1;
							}
							else{
								brancos = brancos +1;
							}
						}
					}
				}
			}
		}
		while(voto != 0);
		System.out.println("Marcela rebeu "+candidato1+" votos");
		System.out.println("Juliano rebeu "+candidato2+" votos");
		System.out.println("Rodrigo rebeu "+candidato3+" votos");
		System.out.println("André rebeu "+candidato4+" votos");
		System.out.println("Houve "+nulos+" votos nulos");
		System.out.println("Houve "+brancos+" votos brancos");
		System.out.println("A porcentagem de votos nulos foi de "+(tvotos/nulos));
		System.out.println("A porcentagem de votos em branco foi de "+(tvotos/brancos));
		
		entrada.close();
		
	}

}
