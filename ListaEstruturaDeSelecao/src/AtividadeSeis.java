import java.util.Scanner;


public class AtividadeSeis {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor que transformarei em outro!");
		int num1 = entrada.nextInt();
		
		if(num1 % 2 == 0 ){
			num1 = num1 + 1;
			System.out.println("Seu n�mero era par agora o transformeu em �mpar, veja voc� mesmo: "+ num1);
		}
		else{
			num1 = num1 + 1;
			System.out.println("Seu numero era impar agora ele virou par veja: "+ num1);
		}
		
		entrada.close();
		
	}

}
