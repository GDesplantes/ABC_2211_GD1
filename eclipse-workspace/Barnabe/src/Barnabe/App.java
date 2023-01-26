package Barnabe;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	double S; //Somme de départ de Barnabé
	
	int magasin = 0;
	
	int R; //Argent restant
	// on declare les variables min et max pour définir les limites
	int min = 100;
	int max = 1000;
	// on declare un objet Random appellé rand
	Random rand = new Random();
	
    // on assigne à la variable nb un nombre aléatoire
    S = rand.nextInt(max - min +1) + min;
 
    
    // on affiche le nombre aléatoire
		
    System.out.println("Barnabe part faire les course");
    
   double calcul;
   
   

    System.out.println(S);
    
  
   while(S>1) {
    	

	   calcul =(((double)S/2)-1);

    	System.out.println(calcul);
    
    	
    	magasin++;
    	
    	S=calcul;
    	
    }
   if (S<=0) {
	   
	   
	   magasin--;
   }
   
 
    System.out.println("Barnabe a visite : " +magasin + " magasins ");
    
    System.out.println("il est pauvre maintenant car il lui reste " +S + " euros ");
    
    System.out.println("faite un don a www.SauverBarnabe"
    		+ ".com");
	} 

	
}
