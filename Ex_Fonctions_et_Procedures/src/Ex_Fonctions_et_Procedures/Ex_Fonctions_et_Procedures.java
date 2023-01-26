package Ex_Fonctions_et_Procedures;

import java.util.Scanner;

public class Ex_Fonctions_et_Procedures {

	public static int pourcentage (int cb, int total, int cheque, int virement) {
		
		
	double pourcent;
		
	pourcent = (total/100);
	
	System.out.println(pourcent);
	
	return pourcent;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double cb;
		double total;
		double cheque;
		double virement;
		
		System.out.println("Veuilez saisir le nombre d'utilisation de votre Carte Bleu" );
		cb=sc.nextDouble();
		System.out.println("Veuilez saisir le nombre d'utilisation de votre Chequier" );
		cheque=sc.nextDouble();
		System.out.println("Veuilez saisir le nombre d'utilisation de votre fonctionnalite Virement" );
		virement=sc.nextDouble();
		
		
		total = (cb + cheque + virement);
		
		pourcentage(pourcent);
		
	}

}
