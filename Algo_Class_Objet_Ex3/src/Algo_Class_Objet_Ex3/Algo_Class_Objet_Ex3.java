package Algo_Class_Objet_Ex3;

import java.util.Scanner;

public class Algo_Class_Objet_Ex3 {

	public static double moyenne (double nb2, double nb1) {
		
		
		double resultat = ((nb1+nb2)/2);
		System.out.println("La moyenne de "+nb1+" et " +nb2+" est de "+resultat);
		return resultat;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double nb1;
		double nb2;
		System.out.println("Veuillez saisir la valeur de nb1");
		nb1=sc.nextDouble();
		System.out.println("Veuillez saisir la valeur de nb2");
		nb2=sc.nextDouble();
		
		
		moyenne(nb1,nb2);
		
		
	}

}
