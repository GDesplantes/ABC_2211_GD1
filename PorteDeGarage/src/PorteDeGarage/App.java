package PorteDeGarage;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);



		PorteDeGarage p = new PorteDeGarage(false,true,0.00,0.00,90.00,"Jack");
		 String ptoString = p.toString();
		 System.out.println(ptoString);
	
		boolean ouvrir =p.ouvrirPartiel(90);
		boolean fermer=p.ouvrirPartiel(25);
	
		boolean unlock = p.deVerouillage();
		boolean unlock2 =p.deVerouillage();
		
		boolean ouvrir1 =p.ouvrirPartiel(100);
		boolean ouvrir2=p.ouvrirPartiel(40);
		boolean fermer1=p.fermerPartiel(25);
		
		
		
	
	}

}
