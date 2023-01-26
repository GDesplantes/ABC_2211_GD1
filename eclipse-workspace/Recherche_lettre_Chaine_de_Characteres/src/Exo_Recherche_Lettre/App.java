package Exo_Recherche_Lettre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String mot = "Bonjour";
		String point = ".";
		String lettre; //Lettre à chercher
		String vide  = "";		
		int Occurence = 0;
		String lire = mot.substring(0,1);
		
		
		System.out.println("Entrez la lettre a rechercher");
		lettre= sc.nextLine();
		
		if (lettre.equals(vide) || lettre.equals(point) ) {
			System.out.println("CETTE CHAINE EST VIDE");
		}
		else { //si ma putain de chaine n'est pas vide
			
			for ( int i =0; i < mot.length(); i++) {
				String charactere = mot.substring(i, i+1);
				
			
				if(lettre.equals(charactere)) {
					Occurence ++;
					
					
				}
			}
			
			if (Occurence ==0 ) {
				System.out.println (" Deso pas Deso mais y'a pas " +lettre);
			}
			else {
				System.out.println(Occurence);
			}
			

		}	

			
		
		
		
	}

}
