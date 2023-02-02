package Projet_Bouteille;

public class App {
	 public static void main(String[] args) {
			// Scanner sc= new Scanner(System.in);
			// int rep;
			// boolean ouvrir;
			
			 Bouteille b = new Bouteille(1, 0.75,false,"Evian");
			 
			 String btoString = b.toString();
			 System.out.println(btoString);
			 
			 
			 boolean resultat = b.ouvrir();//vérification que le boolean ouvert est true
			 boolean resultat2 = b.ouvrir();
			 
			 boolean ferme =b.fermer();
			 boolean ferme2=b.fermer();
			 
			 
	
			 boolean vider = b.vider(0.50);
			 
			 boolean ouvrir = b.ouvrir();
			 
			 boolean vider3 = b.vider(0.75);
			 
			 boolean remplir5=b.remplir(1);
			 
			 boolean vider2 = b.vider(0.50);
			 boolean vide3 =b.vidertout();
			 boolean vide4 =b.vidertout();
			 
			 boolean remplir =b.remplir(0.95);
			 boolean remplir2=b.remplir(0.20);
			 
			 boolean remplirT=b.remplirTout();
			 boolean remplirT2=b.remplirTout();
			 String nom = b.nom;
			 int a =0;
		
				 
				
	 }
}

