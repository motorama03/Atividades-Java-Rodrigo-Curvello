import java.util.Scanner;

public class AtividadeVinteUm {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma data começando pelo dia!");
		int dd = entrada.nextInt();
		
		System.out.println("Agora o mês");
		int mm = entrada.nextInt();
		
		System.out.println("Agora o ano!");
		int aaaa = entrada.nextInt();
		
		boolean passa;
		passa = false;
		
		if (dd <= 31 && dd >= 1){
			if (mm >= 1 && mm <= 12){
				if(aaaa <= 9999 && aaaa >= 0001){
					passa = true;
					System.out.println(dd +"/"+mm+"/"+aaaa);
				}
			}
		}
		if (!passa){
			System.out.println("Data inválida!");
		}
		
		entrada.close();
		
	}

}
