package EVALUATION_19_01_23_GD;
import java.util.Scanner;
public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int mois;
		
		String[] tab = new String[] {"janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre" };
		
		System.out.println("Veuillez saisir le numero de mois ");
		
		mois = sc.nextInt();
		
		for(int i =0; i<tab.length; i++) {
			while (mois>12 || mois<1) {
				System.out.println(mois);
				System.out.println("Numero de mois invalide. Veuillez recommencer.");
				
				mois = sc.nextInt();
				
			}
				if(i == mois-1) {
					System.out.println(tab[i]);
					
					int jour = i+1;
					
					 
					  if (i == 1) {
						
						System.out.println("Le mois de " + tab[i]+" ("+ jour + ")"+ " est pair.");
						System.out.println("Les jours impairs du mois sont :");
						System.out.println(" 1,5,7,11,13,17,19,23,25");
					
						break;
					}


					
					if (i%2 != 0 && i!= 2) {
					
						System.out.println("Le mois de " + tab[i]+" ("+ jour + ")"+ " est pair.");
						System.out.println("Les jours impairs du mois sont :");
						System.out.println(" 1,5,7,11,13,17,19,23,25,29,31");
						}
					
					
					else if (i%2 == 0) {
						
						System.out.println("Le mois de " +tab[i]+ " (" + jour + ")" + " est impair.");
						System.out.println("Les jours pairs du mois sont : ");
						System.out.println("2,4,6,8,12,14,16,18,22,24,26,28");
						
					}
				}
			
		}

	}

}
