import java.util.Scanner;

public class AtividadeTrintaDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		char respostacerta;
		int acertos;
		acertos = 0;
		
		
		System.out.println("Informe quantos kilobits tem um megabit");
		System.out.println("A = 1024, B = 1000, C = 2024, D = 8188, E = 128");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'A'){
			acertos = acertos + 1;
		}
		System.out.println("Quantas letras tem o alfabeto");
		System.out.println("A = 26, B = 24, C = 32, D = 18, E = nenhum");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'A'){
			acertos = acertos + 1;
		}
		// desta em diante
		System.out.println("Qual a capital de santa catarina");
		System.out.println("A = Rio do sul, B = Florianopolis, C = Brasilia, D = Porto Alegre, E = nenhum");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'B'){
			acertos = acertos + 1;
		}
		System.out.println("Quantos % de cacau tem no chocolate branco?");
		System.out.println("A = 27, B = 20, C = 32, D = 18, E = nenhum");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'B'){
			acertos = acertos + 1;
		}
		System.out.println("Qual o cholocate mais Saúdavel");
		System.out.println("A = Chocolate branco, B = chocolate ao leite, C = Choclolate 90%, D = chocolate 30% cacau, E = nenhum");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'C'){
			acertos = acertos + 1;
		}
		System.out.println("Quantas horas tem um dia");
		System.out.println("A = 27, B = 23, C = 24, D = 18, E = 12");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'C'){
			acertos = acertos + 1;
		}
		System.out.println("Quantos dedos um anão tem?");
		System.out.println("A = 10, B = 20, C = 9, D = 20, E = 15");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'D'){
			acertos = acertos + 1;
		}
		System.out.println("Qual nota o aluno que fez está materia merece?");
		System.out.println("A = 5, B = 6, C = 7, D = 10, E = 0");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'D'){
			acertos = acertos + 1;
		}
		System.out.println("Qual o melhor professor do BCC 2022?");
		System.out.println("A = Amauri, B = juliano, C = Ana Paula , D = Patricia, E = Rodrigo Curvello");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'E'){
			acertos = acertos + 1;
		}
		System.out.println("Qau lremedio você deve tomar em caso de queda de cabelo?");
		System.out.println("A = Amoxilina, B = Charmander, C = Balela, D = Paracetamol, E = Dipirona");
		respostacerta = entrada.next().charAt(0);
		if (respostacerta == 'E'){
			acertos = acertos + 1;
		}
	
		entrada.close();
		
	} 

}
