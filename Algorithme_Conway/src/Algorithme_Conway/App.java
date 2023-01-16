package Algorithme_Conway;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//VARIABLES
		
		String valeurs = "1211";
		
		
		
		
		String chiffre = valeurs.substring(0,1); //lis le 1er charactère de la chaine "valeurs"

		String resultat= "";
		
		int occurence =0;
		
		for (int i = 0; i< valeurs.length(); i++ ) {

			String charactere = valeurs.substring(i, i+1);
			
			if(chiffre.equals(charactere) ) {
				occurence+=1;
			} else {
				resultat = resultat + occurence + valeurs.substring(i-1, i);
				chiffre = charactere;
				occurence = 1;
			}
			
		}
		resultat = resultat + ""+ occurence+""+ valeurs.charAt(valeurs.length()-1);
		System.out.println(resultat);
		
		
		
		
		System.out.println("Programme termine");
	
		
	}

}
