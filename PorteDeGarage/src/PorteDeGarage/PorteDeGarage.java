package PorteDeGarage;
import java.util.Scanner;
public class PorteDeGarage {

	Scanner sc = new Scanner(System.in);
	
	
	public boolean verrouiller;
	public double entreOuvert;
	public String nom;
	public double angleMini;
	public double angleMaxi;
	
		public boolean ouvrirPartiel(double ouvertPartiel) 
		{if (verrouiller == false) {
			if(entreOuvert+ouvertPartiel<=angleMaxi ) {
				
				System.out.println("La porte va s ouvrir de " +entreOuvert+ " degres");
				entreOuvert+=ouvertPartiel;
				return true;
			}
			else {
				System.out.println("La porte ne peux pas s'ouvrir plus que " +angleMaxi+ 
						" degres votre requete est donc impossible"
						+" elle s ouvrira donc au maximum soit "+angleMaxi);
				entreOuvert=angleMaxi;
				
				return false;
			}
		}
		else {
			System.out.println("Cette action est impossible car la porte de garage est verrouiller");
			return true;
			
			}
		}
		
		public boolean fermerPartiel(double ouvertPartiel) {
			if (verrouiller == false) {
				if(entreOuvert == 0) {
				 System.out.println("La porte est ferme");
				 
				}
					
				if(entreOuvert>=angleMini) {
					if	(entreOuvert-ouvertPartiel>=angleMini)
						entreOuvert-=ouvertPartiel;
					System.out.println("La porte va se fermer de "+ entreOuvert);
					System.out.println(entreOuvert);
					return true;
				}
				else {
					System.out.println("la porte de peux pas se fermer a plus de 0 degres elle se ferma donc au maximum ");
					entreOuvert=angleMini;
					
					return false;
					
					}
			}
			
			else {	
				System.out.println("Cette action est impossible car la porte de garage est verrouiller");
			return true;
				
			}
		}
		
		public boolean verrouillage() {
			if (entreOuvert == angleMini || entreOuvert == angleMaxi) {
					if (verrouiller == true)
				{
					System.out.println ("La porte est deja verrouille");
					return false;
				
				}
				else {
					
					verrouiller =true;
					System.out.println("La porte est maintenant verouiller");
					return true;
				}
			}
			else {
				System.out.println("La porte ne peut pas etre verrouiller car elle n est pas fermer");
			}
			return false;
		}
		
		public boolean deVerouillage() {
			if (verrouiller == false)
			{	System.out.println("La porte est deja deverrouiller");
				return false;
			}
			else {
				verrouiller = false;
				System.out.println("La porte est maintenant deverouiller");
				return true;
				
			}
		}

	//Constructeur par default
	public PorteDeGarage() 
	{
		
		verrouiller=true;
		entreOuvert =0.0;
		angleMini = 0.0;
		angleMaxi=90.0;
		
		nom="Jack";
	}
	
	//Constructeur classique
	public PorteDeGarage(boolean ouverte, boolean verrouiller, double ouvertPartiel,double mini
			 ,double maxi, String nom) 
	{
		
		this.verrouiller=verrouiller;
		this.entreOuvert=ouvertPartiel;
		this.angleMini=mini;
		this.angleMaxi=maxi;
		this.nom=nom;
	}
	
	 @Override
		public String toString() {
		 return("verrouillage " +verrouiller+" ouverture partiel de "+entreOuvert
				 +" Angle minimal "+angleMini+" angle maximal "+angleMaxi+ 
				 " J ai decide de baptiser la porte "+nom+" Bienvenue "+nom);
		 
	 }
}