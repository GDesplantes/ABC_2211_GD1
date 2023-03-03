package Wall_E;
import java.util.Random;
import java.util.Scanner;
public class Wall_E {
	Scanner sc = new Scanner(System.in);
	
	
	/* Fonctionnalité du Robot (Déplacement  bras articulé, prendre recyclée capacité max de déchets*/
	private boolean allumer;
	private boolean peuxDeplacement;
	private boolean prendre;
	private boolean peuxPrendre;
	
	
	public enum deplacement {
		Avant,
		Arriere,
		Gauche,
		Droite;
	}
	
	
	public Wall_E() 
	{
		System.out.println("Creation du robot - - UwU - - Modele par default");
		allumer = false;
		peuxDeplacement =false;
		prendre =false;
	
		
	}
	
	public Wall_E(boolean bouger, boolean prendre, boolean On,boolean peuxPrendre ) {

		this.peuxDeplacement=bouger;
		this.prendre=prendre;
		
		this.allumer=On;
		this.peuxPrendre=peuxPrendre;
	}
	
	public boolean Allumage() {
		if(allumer==true) 
		{
			return false;
		}
		else {
			allumer=true;
			System.out.println("Waaaaaaall eeeeeee");
			return true;
		}
	}
	public boolean Eteindre() {
		if (allumer==true) 
		{
			allumer=false;
			return true;
			
		}
		else {
			return false;
			}
	}
	
	
	
	private int distanceOb() 
	{
		Random rand = new Random();
		final int borneMin = 0;
		final int borneMax = 100;
		int distance = rand.nextInt(borneMax-borneMin+1)+ borneMin;
		return distance;
	}

	public boolean peuxBouger() 
	{
	int distance=distanceOb();
	if(allumer==true) {
		if(distance<10) {
			peuxDeplacement =false;
			return false;
		}
		else { peuxDeplacement =true;
			return true;
		}
	}
	else {
		return false;
	}
	}
	public String deplacer(deplacement move) 
	{
		peuxDeplacement =peuxBouger();
	String str="Non";
	if(peuxDeplacement == true && allumer == true) 
		{
		
		
		switch(move) 
			{
			case Avant: 
				{
					System.out.println("Le robot avance");
			str = "Le robot avance";
				break;
				}
			case Arriere:
			{
				System.out.println("Le robot recule");
				str = "Le robot recule";
				break;
			}
			case Gauche:
			{
				System.out.println("Le robot va a gauche");
				str = "Le robot tourne à gauche";
				break;
			}
			case Droite:
			{
				System.out.println("Le robot va a gauche");
				str = "Le robot tourne à droite";
				break;
			}
			default : 
			{
				break;
			}
		}
	}
	return str;	
		
		}
	boolean peuxPrendre() {
		int distance =distanceOb();
		if (distance<10) {
			
			peuxPrendre=true;
			return true;
		}
		else {
			peuxPrendre=false;
			return false;
		}
	}
	boolean prendre() {
		if(peuxPrendre == true) {
			

			return true;
		}
		else {
			return false;
		}
	}
	public boolean recycleObjet() {
		if (prendre()==true) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
	}
	
		
	




