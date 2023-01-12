package Tableau_Version_Simple;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		Boolean aTrouve = false;
		int a;
		
		
		int[] tab = new int[] {1,2,3,4,5};
	
		
		System.out.println("Recerche de valeur");
		a = sc.nextInt();
		
	 for (int i=0; i< tab.length; i++)
	 {
		if (tab[i] == a)
			aTrouve = true;
	 }
		 if  (aTrouve)
		 {
			 System.out.println("Vous avez trouver la bonne valeur!!");
			 
		 }
	 
		 else {
			 System.out.println("Error 404.............cheh");
		 }
	 
	 
	}

}
