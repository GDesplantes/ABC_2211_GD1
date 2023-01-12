package Barnabe;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int S; //Somme de départ de Barnabé
		
	int T; //Entier de Transition
	
	// on declare les variables min et max pour définir les limites
	int min = 0;
	int max = 100;
	// on declare un objet Random appellé rand
	Random rand = new Random();
	
    // on assigne à la variable nb un nombre aléatoire
    S = rand.nextInt(max - min +1) + min;
     // on affiche le nombre aléatoire
		
	}

}
