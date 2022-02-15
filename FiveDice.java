// Written by Nubia Levon
// Date: 8-27-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;


public class FiveDice
{
   public static void main (String args[])
   {  // instantiate the objects
      Die [] player = new Die [5];
      Die [] house = new Die [5];
      // reserve mem locations
      for( int x = 0; x < player.length; x++ )
      {
         player[x] = new Die();
         house[x] = new Die();
      }
      
      
      System.out.print("\nPlayer: " );
      // Print out the rolls in the array
      for( Die d : player )
      {
         System.out.print(" " + d.GetRollDie() );
      }
      
      System.out.print("\nHouse: " );
      // Print out the rolls for the computer (house)
      for( Die h : house )
      {
         System.out.print(" " + h.GetRollDie() );  
      }
   
   }


}