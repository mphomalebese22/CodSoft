package com.codsoft;

import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int count=3;
        int guess;
        int correct=0;

        Random rand= new Random();
        int random_num = rand.nextInt(100);
        System.out.println(random_num);

        Scanner sc=new Scanner(System.in);
        String playAgain;

        System.out.print("Enter your name: ");
        String user_name=sc.next();

        System.out.println("Hi "+user_name);
            
        do{  
            
            System.out.println("The number of attempts: "+count);
            System.out.println(" ");
            for(int i=0;i<3;i++) {
                
                System.out.print( "Enter your guess: " );
                guess=sc.nextInt();

                if(random_num>guess){
                System.out.println("The number is too low");
                count--;
                System.out.println("The number of times left: "+count);
                }
                else if (random_num<guess)            {
                    System.out.println("The number is too high");
                    count--;
                    System.out.println("The number of times left: "+count);        
                }
                else{
                    System.out.println(" ");
                    System.out.println("Congatulations, the number is correct");
                    correct++;                 
                    System.out.println("Your score from the game: "+correct );
                    System.exit(0);
                    
                }  
            }  
            Scanner dc=new Scanner(System.in); 
            System.out.print("Do you want to play again? (yes/no): ");  
            count+=3;
            playAgain=dc.nextLine();   

        }
        while(playAgain.equals("yes"));
        count+=3;
        sc.close();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Your score from the game: "+correct );
    }
    
}
