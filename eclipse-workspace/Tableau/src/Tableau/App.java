package Tableau;


import java.util.Scanner;
import java.util.Random;

public class App {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[3];
		
		
		// on declare les variables min et max pour définir les limites
		int min = 0;
		int max = 10;
		// on declare un objet Random appellé rand
		Random rand = new Random();
		// on declare une variable pour y stocker le nombre aléatoire
        int nb1;
        int nb2;
        int nb3;
        // on assigne à la variable nb un nombre aléatoire
        nb1 = rand.nextInt(max - min +1) + min;
         // on affiche le nombre aléatoire
 
        nb2 = rand.nextInt(max - min +1) + min;
        nb3 = rand.nextInt(max - min +1) + min;
        
        if (((nb1<nb2) && (nb1<nb3)) && (nb2<nb3))
        
        	 { tab[0] = nb1;
        	   tab[1] = nb2;
        	   tab[2] = nb3; }
        else if (((nb1>nb2) && (nb1<nb3)) && (nb2<nb3));
        { tab[0] = nb2;
 	      tab[1] = nb1;
 	      tab[2] = nb3; }
        else
        {
        tab[0] = nb3;
     	tab[1] = nb1;
     	tab[2] = nb2; }
 }
	
}
    
