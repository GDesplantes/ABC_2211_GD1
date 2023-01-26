package Jeu_de_la_Fourchette;

import java.util.Scanner;
import java.util.Random;

public class App {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int[] tableau = new int[1];
		
				
		// on declare les variables min et max pour définir les limites
		int min = 0;
		int max = 100;
		// on declare un objet Random appellé rand
		Random rand = new Random();
		// on declare une variable pour y stocker le nombre aléatoire
        int nb;
        // on assigne à la variable nb un nombre aléatoire
        nb = rand.nextInt(max - min +1) + min;
         // on affiche le nombre aléatoire
    	tableau[0] = nb;
    	
    	do {
    	
    	System.out.println("Devine le nombre"
    			+ ""
    			+ ""
    			+ "");
    	a = sc.nextInt();
    	 
    	
    	
    			if(a<nb) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    			
    			System.out.println("+"); }
    		
    				else if(a>nb) {
    			System.out.println("-");
    		}
    	}
while (a!=nb);
    				
    if (a==nb);    {
    		
    System.out.println("GG");
    		
    
    		}
    	}
  }

