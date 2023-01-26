package Calcul_Moyenne;
import java.util.Random;
import java.util.Scanner;
public class App {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double calcul; 
		
		int nb1;
		int nb2;
		int min = 0;
		int max = 1000;
		
		Random rand= new Random();
		
		nb1 = rand.nextInt(max - min +1) + min;
		nb2 = rand.nextInt(max - min +1) + min;
		
		calcul = (nb1 +nb2) /2d;
		
		System.out.println("Voici les 2 variable " +nb1);
		
		System.out.println(" et " +nb2);
		
		System.out.println("La moyenne est de : " +calcul);
	}

}
