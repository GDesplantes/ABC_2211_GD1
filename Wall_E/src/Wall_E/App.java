package Wall_E;

import java.util.ArrayList;

public class App {

	
	public static void main(String[] args) {
	
		;ArrayList<String> controller = new ArrayList<String>();
		controller.add("Avancer");
		controller.add("Reculer");
		controller.add("Pivoter a Droite");
		controller.add("Pivoter a gauche");
		System.out.println("Bonjour et bienvenue dans l interface de controlle du robot Wall E. ");
		System.out.println(		"Voici les different commandes que vous pourrez utiliser afin de controler le robot "+controller);
		
		
		
		
		Wall_E r= new Wall_E(true,false,false,false);
		
		String ptoString = r.toString();
		 System.out.println(ptoString);
	

	boolean test=r.Allumage();
	
	
	
   String bouge= r.deplacer(Wall_E.deplacement.Avant);
   String bouge2= r.deplacer(Wall_E.deplacement.Avant);
   String bouge3= r.deplacer(Wall_E.deplacement.Avant);
   String bouge4= r.deplacer(Wall_E.deplacement.Avant);
   String bouge5= r.deplacer(Wall_E.deplacement.Avant);
	int a=0;
	
	
	boolean prendre =r.peuxPrendre();
	boolean prendre2=r.prendre();
	boolean recyclage = r.recycleObjet();	
	
	}
}
