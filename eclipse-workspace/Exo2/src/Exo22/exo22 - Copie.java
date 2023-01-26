package Exo22;

import java.util.Scanner;

public class exo22 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	int A = 0;
	int B = 0;
	
	System.out.println("verification de l'ordre");
	
	System.out.println(" A est egale a ");

	A = sc.nextInt();
	
	System.out.println("B est egale a ");
	
	B = sc.nextInt();
	
		if (A<B) {
			System.out.println("l'ordre croissant est " + A+ " puis " + B );
		}
		else {
			System.out.println("l'ordre croissant est " + B + "  puis  "  + A);
		}
	
	sc.close();
	
	}

}
