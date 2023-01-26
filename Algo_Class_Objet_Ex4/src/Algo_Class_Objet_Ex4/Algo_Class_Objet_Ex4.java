package Algo_Class_Objet_Ex4;
import java.util.Scanner;
public class Algo_Class_Objet_Ex4 {

		public static boolean bissextile (int annee) {
			if (annee%4 == 0 && annee%100!=0 ||annee%400 ==0) {
				return true;

			}
		
			else {
				return false;
			}
			

		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int annee;
		
		System.out.println("Veuillez saisir une annee");
		
		annee = sc.nextInt();
		
		if (bissextile(annee)) {
		
			System.out.println("l'annee est bissextile!");
		}
	
		else {
			System.out.println("l annee n est pas bissextile!");
		}
		
 sc.close();
 
	}

}
