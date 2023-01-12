package Exo2;

import java.util.Scanner;

public class Exo2{
	public static void main(String[] arg) {
	
	 int a = 0;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Vérification de l'age");
	 
	 a = sc.nextInt();
	
	 while(a<=0) {
		 System.out.println("vous etes pas encore né");
		 
		a = sc.nextInt();
	 }
	 
	 if(a <18 && a>0) {

		 System.out.println("Vout etes mineur");
	 }
		 else
		 {
			 System.out.println("Vous etes majeur");
		 }
	sc.close();
	}
	
}
