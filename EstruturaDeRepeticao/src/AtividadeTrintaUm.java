import java.util.Scanner;

public class AtividadeTrintaUm {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int cod;
		cod = 0;
		int codM;
		codM = 0;
		int codB;
		codB = 0;
		float altura;
		altura = 0;
		float alturaM;
		float alturaB;
		alturaB = 10000;
		alturaM = 0;
		
		for(int x = 1; x <= 10; x++) {
		
		System.out.println("Informe o código do aluno");
		cod = entrada.nextInt();
		
		System.out.println("Agora informe a altura do aluno!");
		altura = entrada.nextFloat();
		if (altura > alturaM) {
			alturaM = altura;
			codM = cod;
		}
		if(altura < alturaB) {
			alturaB = altura;
			codB = cod;
		}
		}
		
		System.out.println("O aluno de codigo "+codB+" é o mais baixo com "+alturaB+" de altura");
		System.out.println("O aluno de codigo "+codM+" é o mais alto com "+alturaM+" de altura");
	
	entrada.close();
		
	}

}
