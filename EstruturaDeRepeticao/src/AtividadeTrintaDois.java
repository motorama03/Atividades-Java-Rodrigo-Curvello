import java.util.Scanner;

public class AtividadeTrintaDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("A partir de 5 cidades responda.");
		int qntveiculo;
		int totalveiculos;
		float mediaveiculos;
		int acidentes;
		int Tacidentes;
		Tacidentes = 0;
		totalveiculos = 0;
		int maisacidente;
		int citmaisacidente;
		citmaisacidente = 0;
		int citmenosacidente;
		citmenosacidente = 10000000;
		maisacidente = 0;
		int menosacidente;
		menosacidente = 10000000;
		mediaveiculos = 0;
		int menos2k = 0;
		int media2k = 0;
		int qntmenos2k = 0;
				
		
		
		for(int x = 1; x <= 5; x++){
			qntveiculo = 0;
			acidentes = 0;
			
			System.out.println("Para "+x+"º cidade:");
			System.out.println("Quantos veiculos de passeio ");
			qntveiculo = entrada.nextInt();
			totalveiculos = totalveiculos + qntveiculo;
			System.out.println("Dentre os "+qntveiculo+" quantos acidentes fatais ocorreram?");
			acidentes = entrada.nextInt();
			
			while(acidentes > qntveiculo){
				System.out.println("O valor não pode ser maior que a quantidade de carros");
				acidentes = entrada.nextInt();
			}
			
			Tacidentes = Tacidentes + acidentes;
			
			if(acidentes > maisacidente){
				maisacidente = acidentes;
				citmaisacidente = x;
			}
			if(acidentes < menosacidente){
				menosacidente = acidentes;
				citmenosacidente = x;
			}
			if(qntveiculo <= 2000){
				qntmenos2k = qntmenos2k + 1;
				menos2k = menos2k + acidentes;
			}
			
			
		}
		
		media2k = menos2k / qntmenos2k;
		mediaveiculos = (totalveiculos/5);
		System.out.println("A média de veiculos entre as 5 cidades é de "+mediaveiculos);
		
		System.out.println("A cidade com mais acidentes foi a "+citmaisacidente+"º cidade com "+maisacidente+" casos");
		System.out.println("A cidade com menos acidentes foi a "+citmenosacidente+"º cidade com "+menosacidente+" caso");
		System.out.println("E a media de acidentes nas cidade com menos de 2.000 carros de passeio é de "+media2k);
	
		entrada.close();
		
	}

}
