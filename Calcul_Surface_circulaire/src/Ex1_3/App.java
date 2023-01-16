package Ex1_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/* création de la variable R --> & A --> angle */

		double R = 0;
		double A = 0;
		// Déclaration de pi

		double Pi = Math.PI;
		double calcul;

		System.out.println("veuillez saisir la valeur du Rayon (R) ");

		R = sc.nextDouble();

		System.out.println("Veuillez saisir la valeur de l'angle (A) ");

		A = sc.nextDouble();

		calcul = ((Pi * Math.pow(R, 2) * A) / 360);
		System.out.println("Calcul de la surface en cour........");

		System.out.println("Voici la surface du cercle : " + calcul);

	}

}
