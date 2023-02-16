package Ascenceur;

public class Ascensceur {
	
	/*private boolean boutonAppelUp;
	private boolean boutonAppelDown;
	private boolean bouton0;//bouton étage 0
	private boolean bouton1;//bonton etage 1
	private boolean bouton2;//bouton etage 2
	private boolean bouton3;//bouton etage 3
	private boolean clefPrio;//clef de priorité qui court-circuite l'ordre de base
	*/
	
	public double etageMini;
	public double etageMaxi;
	public double numEtage;
	public double destination;
	public boolean porteOuverte;
	public boolean verrUrgence;
	
	
	public boolean ArretUrgence() {
		if(verrUrgence == false) {
			return true;
} 
	else {
		return false;
	}
}
	public boolean PorteOuverte() {
		if(porteOuverte ==true) {
			return true;
		}
		else {
			return false;
		}
	}
	

	//declarer la variation d etage
	
	public boolean mouvement(double destination) {
		if(verrUrgence == true) {
			return false;
		}
		else {
			
		}
			if(numEtage == destination) {
					
					if(destination<=etageMaxi && destination >= etageMini) {
						numEtage = destination;
						return true;
						}
						else {
							return false;
							}
				}	
					{
						return true;
					}
				
		
	}
	
	
	//CONSTRUCTEUR
	
	public Ascensceur(boolean verrUrgence,double etageMini, double etageMaxi, double numEtage,boolean porteOuverte) {
		
		this.etageMaxi=etageMaxi;
		this.etageMini=etageMini;
		this.numEtage=numEtage;
		this.porteOuverte=porteOuverte;
		this.verrUrgence=verrUrgence;
		
	}
	
	/*public String toString() {
		 return(); 

	}
*/
	
	
	
	
}

