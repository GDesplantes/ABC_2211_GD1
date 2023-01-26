package Calcul_Aire_Volume;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		
		double pi = Math.PI;
		
		int rayon;
		
		double calculA;
		double calculV;
		
		System.out.println("le rayon a pour valeur : ");
		rayon = sc.nextInt();
		
		calculA = 4 * pi * Math.pow(rayon, 2);
		
		
		calculV = 4/3d * pi * Math.pow(rayon, 3);
		
		System.out.println("l aire de la sphere est egal a : " +calculA);
		
		System.out.println("Le volume de la sphere est egal a :" +calculV);
	}

}
