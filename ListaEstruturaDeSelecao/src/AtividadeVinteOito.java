import java.util.Scanner;

public class AtividadeVinteOito {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Diga S ou N para cada pergunta!");
		System.out.println("'Telefonou para a v�tima?''");
		char crime = entrada.next().charAt(0);
		int criminoso;
		criminoso = 0;
		
		if (crime == 'S'){
			criminoso = criminoso + 1;
		}
		
		System.out.println("'Esteve no local do crime?''");
		crime = entrada.next().charAt(0);
		
		if (crime == 'S'){
			criminoso = criminoso + 1;
		}
		
		System.out.println("'Mora perto da v�tima?''");
		crime = entrada.next().charAt(0);
		
		if (crime == 'S'){
			criminoso = criminoso + 1;
		}
		
		System.out.println("'Devia para a v�tima?'");
		crime = entrada.next().charAt(0);
		
		if (crime == 'S'){
			criminoso = criminoso + 1;
		}
		
		System.out.println("'J� trabalhou com a v�tima?'");
		crime = entrada.next().charAt(0);
		
		if (crime == 'S'){
			criminoso = criminoso + 1;
		}
		
		if (criminoso < 2){
			System.out.println("Voc� � inocente");
		}
		else{
			if (criminoso == 3 || criminoso == 4){
				System.out.println("Voc� � C�plice!");
			}
			else{
				if (criminoso == 5){
					System.out.println("Voc� � o assassino!!!");
				}
			}
		}
	
		entrada.close();
		
	}
}
