package Projet_Bouteille;
import java.util.Scanner;
public class Bouteille{
	
	public final double capaciteEnL;
	public  double contenanceEnL;
	public  boolean estOuverte;
	public  String nom;
	
	// les methodes
	
	public  boolean ouvrir()
	{
		if(estOuverte == true)
		{
			System.out.println("La bouteille est ouverte! Vous pouvez donc choisir de la vider/la remplir ou fermer la bouteille");
			return false;
			
		}
		else
		{	estOuverte =true;
			System.out.println("La bouteille est ferme! Vous ne pouvez donc pas choisir de la vider/la remplir ou fermer la bouteille");
			 System.out.println("Cependant vous pouvez choisir de l'ouvrir ou non");
			 
			return true;
			
		}
		
	
	}
	
	
	public  boolean fermer()
	{
		if(estOuverte == false)
		{
			System.out.println("La bouteille est fermer");
			return true;
		}
		else
		{
			System.out.println("La bouteille est ouverte");
			estOuverte = false;
			return false;
		}
	}
	
	public  boolean remplirTout()
	{
		if (estOuverte ==true) {
			if(contenanceEnL < capaciteEnL)
			{contenanceEnL =capaciteEnL;
			System.out.println("La bouteille a ete remplie entierement");
			
				return true;
			}
			else
			{
				System.out.println("La bouteille est deja pleine");
				return false;
			}
		
		}
		else {
			System.out.println("Cette action est impossible car la bouteille est ferme");
			return false;
		}

	} 
	public  boolean remplir(double quantiteEnL)
	{
		if (estOuverte ==true) {
			if(quantiteEnL + contenanceEnL <= capaciteEnL)
			{
				System.out.println("La bouteille a bien ete remplie de "+quantiteEnL);
				return true;
			}
			else
			{
				System.out.println("Vous ne pouvez pas ajouter " +quantiteEnL+" La bouteille deborderai!");
				return false;
			}
		}
		else {
			System.out.println("Cette action est impossible car la bouteille est ferme");
			return false;
		}
		
	}
	
	public  boolean vidertout()
		{
		if(estOuverte == true) {
			if(contenanceEnL > 0)
			{
				System.out.println("La bouteille a ete entierement vider");
				contenanceEnL=0;
	
				return true;
	
			}
			else
			{	
			
				System.out.println("La bouteille est deja vide");
				return false;
			}
		}
		else {
			System.out.println("Cette action est impossible car la bouteille est ferme");
			return false;
		}
	}
	
	public  boolean vider(double quantiteEnL)
	{
		if (estOuverte == true) {
			
			if(quantiteEnL <= contenanceEnL)
			{
				System.out.println("La bouteille a ete vide de " +quantiteEnL+ " il reste donc "+ (contenanceEnL-quantiteEnL)+"L");
				contenanceEnL=(contenanceEnL-quantiteEnL);
				return true;
			}
			else
			{
				return false;
			
			}
		}
		else {
			System.out.println("Vous ne pouvez pas vider la bouteille");

			return false;
		}
	}
	
	public  String DonneLeNom()
	{
		return this.nom;
	}
	
	// Le constructeur par defaut
	 public Bouteille()
	{
		capaciteEnL = 1;
		contenanceEnL = 0;
		estOuverte = false;
		nom = "";
	}
	 
	 // Le constructeur classique
	 public Bouteille(double _capaciteEnL , double _contenanceEnL,boolean _estOuverte, String _Nom)
	 {
		this.capaciteEnL = _capaciteEnL;
		this.contenanceEnL = _contenanceEnL;
		this.estOuverte = _estOuverte;
		this.nom = _Nom;
	 }
	 
	 @Override
		public String toString(){
		
		return ("capacitee en L "+capaciteEnL+" Contenance en L "+contenanceEnL+" Est ouverte " +estOuverte+ " Nom "+nom);
	 }
	
	

}
