package Algo_Class_Objet_Ex2;
import java.util.Scanner;
public class Algo_Class_Objet_Ex2 {
	
	public static void calcul (double a, double b, double c) {
		
		double p;
		p=a+b+c;
		
		System.out.println("Le perimetre du triangle est de " +p);
	
		double aire;
		
		aire=Math.pow(((p/2-a)*(p/2-b)*(p/2-c)) , 0.5);
	
		System.out.println("L air du triangle est de " +aire);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		
		System.out.println("Veuillze rentrer la valeur de a");
		a= sc.nextInt();
		System.out.println("Veuillze rentrer la valeur de b");
		b=sc.nextInt();
		System.out.println("Veuillze rentrer la valeur de c");
		c=sc.nextInt();
		 
		calcul(a,b,c);
		

	}

}
