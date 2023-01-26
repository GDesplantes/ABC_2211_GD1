package test;

import java.io.Closeable;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        
        int a;
        Scanner reader= new Scanner(System.in);
        readeScanner Closeable;
        for (a=-5; a<=18; a++) {System.out.println(a);} 
        if (a>=18) {System.out.println("bravo vous êtes majeur");}


            a = reader.nextInt();
            if (a<18 && a>0) {
                System.out.println("Vous êtes mineur");
            }
            if (a>=18) {
                System.out.println("Vous êtes majeur");
            }
            if (a<0) {
                System.out.println("vous n'êtes pas né");
            }
        
        

    }
}