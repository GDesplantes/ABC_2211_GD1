package CodePorteDeGarageV2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodePorteDeGarageV2 p = new CodePorteDeGarageV2(true, 0.0,0.0,0.0,90);// creation de la porte
		
		String ptoString = p.toString();
		 System.out.println(ptoString);
		 
		 boolean ouvrir = p.ouverture(25.0);
		 boolean ouvrir1 = p.ouverture(25.0);
		 boolean fermer = p.fermeture(50.0);
		 boolean fermer2 = p.fermeture(0);
		 
		 boolean unlock =p.unlock();
		 
		 boolean ouvrir2 = p.ouverture(25.0);
		 boolean ouvrir12 = p.ouverture(35.0);
		 boolean fermer3 = p.fermeture(50.0);
		 boolean fermer22 = p.fermeture(25);
		 
		 boolean ouvrir5 =p.ouverture(100);
		 boolean ouvert =p.verifNonFermer();
		 boolean fermeture = p.veriffermer();
		 boolean fermer32 = p.fermeture(50.0);
		 boolean fermer225 = p.fermeture(15.0);
		 boolean fermer325 = p.fermeture(50.0);
		 
		 boolean ouverture =p.verifNonFermer();
		 boolean fermeture1 = p.veriffermer();
	}

}
