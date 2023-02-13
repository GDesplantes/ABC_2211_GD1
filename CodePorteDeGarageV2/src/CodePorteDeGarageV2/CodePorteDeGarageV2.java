package CodePorteDeGarageV2;

public class CodePorteDeGarageV2 {
	
	public boolean verrouiller;// methode de vérrouillage
	public double angleOuverture;// angle dont la porte sera ouverte ou nom
	public double valeurOuverture;//valeur pour l'instruction(ouvrir de X degres)
	public double valeurFermeture;
	public double angleMini;//angle minimum d'ouverture
	public double angleMaxi;//angle maximum d'ouverture

	
	public boolean verrouillage() {
		if (verrouiller == true) {
			return false;
		}
			if (verrouiller == false) {
			if (angleOuverture == angleMini || angleOuverture == angleMaxi) {
				
				return true ;
						}
			else {
				return false;
			}
			}else {
				return false;
			}
	}
	
	public boolean unlock() {
		if (verrouiller == true) {
			verrouiller = false;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean ouverture(double valeurOuverture) {
		if (verrouiller == false) {
			
			angleOuverture = angleOuverture+valeurOuverture;
			
			if (angleOuverture> angleMaxi) {// si l'utilisateur veut fermer la porte avec une trop grande valeur --> ouverture minimum
				angleOuverture = angleMaxi;
			if(angleOuverture<=angleMaxi && angleOuverture>=angleMini) {		//tentative d'ouvrir la porte de X degres
				
			
				System.out.println(angleOuverture);
				
				return false;
						

				}else 
				{
					
				}
			
			return false;
		}else {
				return true;
			}
	
}
else
{
 return false;
}
		
}
		
	
	public boolean fermeture(double valeurOuverture) {
		if (verrouiller == false) {
			
			angleOuverture = angleOuverture-valeurOuverture;
			
			if (angleOuverture< angleMini) {// si l'utilisateur veut fermer la porte avec une trop grande valeur --> ouverture minimum
				angleOuverture = angleMini;
			if(angleOuverture<=angleMaxi && angleOuverture>=angleMini) {		//tentative d'ouvrir la porte de X degres
				
			
				System.out.println(angleOuverture);
				
				
						return false;

				}else 
				{
					
				}
			
			return false;
		}else {
				return true;
			}
	
}
else
{
 return false;
}
	
}
		
	public boolean veriffermer() {
		if (angleOuverture == 0) {
			return true;
				
			}
		else {
			return false;
		}
	}
	
public boolean verifNonFermer( ) {
	if(angleOuverture != 0) {
		return true;
	}
	else {
		return false;
	}
}


	
	//constructeur
	public CodePorteDeGarageV2 (boolean verrouiller,double angleOuverture,double valeurOuverture, double angleMini,
			double angleMaxi) {
	
	this.verrouiller=verrouiller;
	this.angleOuverture=angleOuverture;
	this.valeurOuverture=valeurOuverture;
	this.angleMini=angleMini;
	this.angleMaxi=angleMaxi;
	
	}


	@Override
	public String toString() {
	 return("verrouillage " +verrouiller+" ouverture partiel de "+angleOuverture
			 +" Angle minimal "+angleMini+" angle maximal "+angleMaxi 
			 ); 

}
}