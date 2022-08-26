import java.util.Scanner;

public class AtividadeTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um nome > que 3 caracteres!");
		String nome = entrada.next();
		
		int tamnome;
		tamnome = nome.length();
		
		System.out.println("Informe uma idade > 0 e < 150!");
		int idade = entrada.nextInt();
		
		System.out.println("Informe seu salário > 0!");
		float salario = entrada.nextFloat();
		
		System.out.println("Informe f ou m para Sexo!");
		char sexo = entrada.next().charAt(0);
		
		//System.out.println("Informe o estado civil");
		
		do{
			System.out.println("Informe um nome > que 3 caracteres!");
			nome = entrada.next();
			tamnome = nome.length();
			
			System.out.println("Informe uma idade > 0 e < 150!");
			idade = entrada.nextInt();
			
			System.out.println("Informe seu salário > 0!");
			salario = entrada.nextFloat();
			
			System.out.println("Informe f ou m para Sexo!");
			sexo = entrada.next().charAt(0);
			
		} while((tamnome < 3) && (idade < 0 && idade > 150) && (salario < 0) && (sexo != 'f' && sexo != 'm'));
		
		System.out.println("Cadastrado com sucesso! Bem vindo "+nome);

		entrada.close();
		
	}

}
