import java.util.Scanner;

public class AtividadeVinteNove {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		boolean passa;
		passa = true;
		
		while (passa){
			
		System.out.println("Informe o tipo de combústivel, 1-Álcool, 2-Gasolina");
		int num = entrada.nextInt();
		if (num == 1){
			System.out.println("Informe quantos litros de Álcool você deseja abastecer");
			double Aalcool = entrada.nextDouble();
			Aalcool = Aalcool * 1.9;
			passa = false;
			System.out.println("Valor total: "+ Aalcool);
		}
		else{
			if (num == 2){
				System.out.println("Informe quantos litros de Gasolina você deseja abastecer");
				double Ggasolina = entrada.nextDouble();
				Ggasolina = Ggasolina * 2.5;
				passa = false;
				System.out.println("Valor total: "+ Ggasolina);
			}
			else{
				passa = true;
				System.out.println("Informe um tipo certo de combústivel!");
			}
		}
		
		}
		
		entrada.close();
		
	}

}
