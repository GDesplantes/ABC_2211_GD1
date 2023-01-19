package Exo_Tableau_ABCDEV2211;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean Existe = false;
		
		int ID;
		
		String[] Tab = new String[] {"Terence", "Frederic", "Mickael","Stefan","Olivier","Guillaume","Mustapha","Raphael" ,"Natana","Kevin","Florian","Samba"};

	System.out.println("Veuillez entrer votre numero d identification : ");
	
	ID = sc.nextInt();
	
	for(int i=0; i<Tab.length; i++) {
		
		
		if  (i == ID-1) {
			
			Existe =true;
			
			
			
		}
		
			if (Existe) {
			System.out.println("Bonjour"+Tab[i] + "Bienvenue");
			
			}
		
			else {
			System.out.println("Identification impossible");
			
			System.out.println("ERREUR SYSTEM");
			
			System.out.println("AUTO-DESTRUCTION ACTIVE DANS");
			
			System.out.println("3" + "2" + "1" +"NAN JE RIGOLE");
			}
			
		
			
	}
		
	
	}

}
