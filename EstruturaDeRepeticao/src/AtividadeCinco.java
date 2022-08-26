import java.util.Scanner;

public class AtividadeCinco {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Em linha!");
		for(int x = 0; x <= 20; x++){
			System.out.print(x+" ");
		}
		System.out.println("");
		System.out.println("Em coluna!");
		for(int x = 0; x <= 20; x++){
			System.out.println(x+" ");
		}
	
		entrada.close();
		
	}

}
