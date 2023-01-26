package Algorithme_class_objet;
import java.util.Scanner;

public class App {

	
	public static void inversion(int a, int b) 
	{
	int tmp;

	tmp=a;
	a=b;
	b=tmp;
	
	System.out.println("Apres permutation, le nombre 1 est = a "+a+ " et le nombre b est = a "+b);
	
	
	
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

	
	int a;
	int b;
	
	System.out.println("Veuillez entrer une valeur pour a ");
	a=sc.nextInt();
	System.out.println("Veuillez entrer une valeur pour b ");
	b=sc.nextInt();
	
	System.out.println("Voici les valeurs de a et b avant inversion" +a+" "+ b);		
		
	inversion(a,b);
		
	}

}
