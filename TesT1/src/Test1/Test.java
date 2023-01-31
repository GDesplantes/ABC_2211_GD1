package Test1;

public class Test {
	 public boolean Marche()
     {
         boolean estOuverte = false;
		if (estOuverte == false) // Si bouteille est fermée
         {
             estOuverte = true; // tu me passe l'état à ouverte
           System.out.println("La bouteille est ouverte.");
             return true; // l'action d'ouvrir la bouteille a réussit
         }
         else
         {
             System.out.println("Echec de l'opération 'Ouvrir'.");
             return false; // Si la bouteille est déjà ouverte, tu retourne que l'action a échouée.
         }
     }
	public static void main(String[] args) {
		
	}

}
