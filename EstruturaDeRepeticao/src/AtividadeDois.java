import java.util.Scanner;

public class AtividadeDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o login...");
		System.out.print("E-mail: ");
		String login = entrada.next();
		System.out.println(" ");
		System.out.print("Senha: ");
		String senha = entrada.next();
		
		while (login == senha){
			System.out.println("Erro, não é permitido login = senha!");
			
			System.out.print("E-mail: ");
			login = entrada.next();
			System.out.println(" ");
			System.out.print("Senha: ");
			senha = entrada.next();
		}
		
		System.out.println("Bem vindo "+ login);
		
		entrada.close();
		
	}

}
