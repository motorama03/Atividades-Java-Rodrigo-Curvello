import java.util.Scanner;

public class AtividadeSeis {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		for(int x = 0; x <= 50; x++){
			if((x % 3 == 0 && !(x % 2 == 0)) || (x % 3 == 0 && x % 7 == 0)){
				System.out.println(x);
			}
		}
	
		entrada.close();
		
	}

}
