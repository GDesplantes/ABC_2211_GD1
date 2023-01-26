package test2;

import java.util.Scanner;

public class test2 
{
   public static void main(String[] args)
   
    {
        Scanner scanner;
        String nom;

        scanner = new Scanner(System.in);
        
        System.out.println("PTDR T QI?");

        nom=scanner.nextLine();
        
        System.out.println("Bienvenue " + nom);
        System.out.println("Installe toi y'a du coca");
        scanner.close();

        
    }


}


