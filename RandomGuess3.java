// Written by Nubia Levon
// Date: 8-28-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;


public class RandomGuess3
{
   public static void main (String args[])
   {  
      int houseGuess;
      int playerGuess;
      int count = 1;
      
      // Generate a random number
      houseGuess = rand();   
      do
      {  // Prompt the user for a guess of the correct number
         playerGuess = promptUser();

         // Determine if guess is high or low
         if (houseGuess > playerGuess)
            System.out.println("Your guess " + playerGuess + " is too low, guess again!");
         else if (houseGuess < playerGuess)
            System.out.println("Your guess " + playerGuess + " is too high, guess again!");
         else
         {
            String keyin;
            Scanner keyboard = new Scanner (System.in);
            
            System.out.println("You got it " + playerGuess + " is right in " + count + " attempts" );
            // Ask user to play again
            System.out.print("Want to play again? (Y/N): >>" );
            keyin = keyboard.nextLine();
            // If user presses y then reset the game values
            if (keyin.charAt(0) == 'Y' ||  keyin.charAt(0) == 'y')
            {
               houseGuess = rand();
               playerGuess = 0;
               count = 0;
            }
            else
               System.out.println("Thank you for playing the guessing game" );
         }   
         count++;
                 
      } while ( houseGuess != playerGuess ); 
   }
   public static int rand()
   {     
         // Generates the random number
         final int HIGHEST_VALUE = 1000;
         final int LOWEST_VALUE = 1;
         int r;
   
         r = ((int)(Math.random()*1000) % HIGHEST_VALUE + LOWEST_VALUE);
         return r;
   }
   
   public static int promptUser()
   {     
         // Prompts the user for the entry of a number
         int userInt;
         System.out.print("Please enter a number between 1 and 1000: >> ");
         Scanner keyboard = new Scanner( System.in );
         userInt = keyboard.nextInt();
         keyboard.nextLine();
         return userInt;
    }

}
